package jp.ac.controller;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jp.ac.beans.AttSelectModel;
import jp.ac.beans.HolidayApplyModel;
import jp.ac.beans.LoginModel;
import jp.ac.beans.MemberModel;
import jp.ac.services.AttSelectService;
import jp.ac.services.HolidayApplyService;
import jp.ac.services.LoginService;
import jp.ac.services.MemberService;
import jp.ac.services.TimeService;
import jp.ac.util.Accountinfo;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class HomeController {

	@Autowired
	private TimeService TimeService;
	@Autowired
	private MemberService MemberService;
	@Autowired
	private LoginService LoginService;
	// Service依存性注入
	private Accountinfo user = new Accountinfo();
	// user情報を保存
	@Autowired
	private AttSelectService AttSelectService;
	@Autowired
	private HolidayApplyService holidayService;

	// ホーム
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	// 会員登録
	@RequestMapping(value = "sign", method = RequestMethod.GET)
	public String sing(Locale locale, Model model) {
		return "join";
	}

	@PostMapping("register")
	public String register(MemberModel Account) throws Exception {
		MemberService.save(Account);
		return "home";
	}

	// ログイン
	@PostMapping("/login")
	public ModelAndView login(LoginModel id, HttpSession session) throws Exception {
		String employeeId = LoginService.logincheck(id, session);
		ModelAndView mav = new ModelAndView();
		// もし、アイディーがヌールじゃないと、勤務登録ビューに行く
		if (employeeId != null) {
			mav.setViewName("attInsertView");
			mav.addObject("msg", "success");
		// 違うと、ホームに行く
		} else {
			mav.setViewName("home");
			mav.addObject("msg", "failure");
		}
		user.setId(employeeId);
		return mav;
	}
	
	// 出勤したときの時間表示
	@ResponseBody
	@RequestMapping(value = "time.att", method = RequestMethod.POST)
	public void Clockatt(Timestamp clock, HttpServletRequest request) throws Exception {
		
		int id = Integer.parseInt(user.getId());
		TimeService.Clocksaveatt(clock, id);

	}
	
	// 退勤したときの時間表示
	@ResponseBody
	@RequestMapping(value = "time.lea", method = RequestMethod.POST)
	public void Clocklea(Timestamp clock, HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(user.getId());
		TimeService.Clocksavelea(clock, id);
	}
	
	
	// 安ウンビョル　------------------------------------------------------------------------
	
	/**
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	
	// 職員勤務照会
	@GetMapping("attSelect")	
	public String attSelect(Model model) throws Exception {
		log.info("****attSelect****");
		
		// 現在、ログインしているID
		int id = Integer.parseInt(user.getId());
		// 現在のIDを確認
		log.info(id);	
		
		// xmlで作成されたクエリーから出た内容をHomeControllerで貯蔵
		List<AttSelectModel> list = AttSelectService.attSelect(id);

		model.addAttribute("list", list);
		
		// 職員勤務照会のJSPに行く
		return "attSelectView";	

	}
	
	/**
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="holidayApply")	
	public String holidayApply(Model model) throws Exception {

		String employeeId = user.getId();
		//セッションIDでユーザー名を取得
		String employeeName = holidayService.getEmpName(employeeId);
		//休暇申請テーブルのシリアルナンバーの中で最も大きい数字を表示
		int maxSeriesNum = holidayService.getMaxSeriesNum();	
		
		model.addAttribute("employeeId", employeeId);
		model.addAttribute("employeeName", employeeName);
		model.addAttribute("seriesNum", maxSeriesNum);
		//セッションIDに該当するリストを読み込む
		model.addAttribute("list", holidayService.holidayList(Integer.valueOf(user.getId())));
		
		//個人休暇申請
		return "holidayApplyView";
	}
	
	/**
	 * 
	 * @param request
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value="holidayInsert")
    public String holidayInsert(HttpServletRequest request, Model model) throws Exception{
		
		//個人休暇申請 beans
		HolidayApplyModel holidayVO = new HolidayApplyModel();
		
		//holidayApplyView.jspでデータを受け取ってbeansファイルに保存
		holidayVO.setSeriesNum(Integer.parseInt(request.getParameter("seriesNum")));
		holidayVO.setEmployeeId(Integer.parseInt(request.getParameter("employeeId")));
		holidayVO.setEmployeeName(request.getParameter("employeeName"));
		holidayVO.setYearTimeCode(Integer.parseInt(request.getParameter("yearTimeCode")));
		holidayVO.setFromDate(request.getParameter("fromDate"));
		holidayVO.setToDate(request.getParameter("toDate"));
		holidayVO.setGrounds(request.getParameter("grounds"));
		holidayVO.setRegistred(request.getParameter("employeeId"));		
		
		holidayService.holidayInsert(holidayVO);
        
		//個人休暇申請
        return "redirect:holidayApply";
    }
	
	@GetMapping(value="holidayDelete")
	public String holidayDelete(@RequestParam("seriesNum") String seriesNum) {
		
		//holidayApplyView.jspでajaxに渡された配列(チェックされたリスト項目)をString配列に保存してint配列に変換
		String[] arrIdx = seriesNum.toString().split(",");
		int[] seriesNumArray = Arrays.stream(arrIdx).mapToInt(Integer::parseInt).toArray();
		
		//配列アドレスに保存されているseriesNumとして選択項目をdbから削除
		for (int i=0; i<arrIdx.length; i++) {
			holidayService.holidayDelete(seriesNumArray[i]);
		}
		
		//個人休暇申請
		return "redirect:holidayApply";
	}
}
