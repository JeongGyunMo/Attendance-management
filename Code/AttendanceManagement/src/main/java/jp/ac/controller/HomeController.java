package jp.ac.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
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
	
	Date NowDay = new Date();
	SimpleDateFormat Format = new SimpleDateFormat ("yyyy/MM/dd");
	String NowDate = Format.format(NowDay);
	
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

	//会員登録
	@PostMapping("register")
	public String register(MemberModel Account) throws Exception {
		MemberService.save(Account);
		return "home";
	}

	// ログイン
	@PostMapping("/login")
	public ModelAndView login(Model model, LoginModel id, HttpSession session) throws Exception {
		String employeeId = LoginService.logincheck(id, session);
		ModelAndView mav = new ModelAndView();
		// もし、アイディーがヌールじゃないと、勤務登録ビューに行く
		if (employeeId != null) {
			// 現在、ログインしているID
			// xmlで作成されたクエリーから出た内容をHomeControllerで貯蔵
			List<AttSelectModel> list = AttSelectService.attSelect(Integer.parseInt(employeeId));
			int count = list.size() - 1;
			if (list.isEmpty()) {
				user.setId(employeeId);
				mav.setViewName("attInsertView");
				return mav;
			}
			String day = list.get(count).getDate1().toString();
			model.addAttribute("list", list.get(count));
			model.addAttribute("Date", day);
			model.addAttribute("NowDate", NowDate);
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

	@RequestMapping(value = "/attInsertView", method = RequestMethod.GET)
	public String 勤務(Model model) throws Exception {
		// 現在、ログインしているID
		int id = Integer.parseInt(user.getId());
		// xmlで作成されたクエリーから出た内容をHomeControllerで貯蔵
		List<AttSelectModel> list = AttSelectService.attSelect(id);
		int count = list.size()-1;
		if (list.isEmpty()) {
			return "attInsertView";
		}
		String day = list.get(count).getDate1().toString();
		model.addAttribute("list", list.get(count));
		model.addAttribute("Date", day);
		model.addAttribute("NowDate", NowDate);
		return "attInsertView";
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
		List<AttSelectModel> list = AttSelectService.attSelect(id);
		int count = list.size() - 1;
		if (count == -1) {
			log.info("****Error****");
		}
		String day = list.get(count).getDate1().toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse(day);
		TimeService.Clocksavelea(clock,date, id);
	}

	// 勤務内容
	@ResponseBody
	@RequestMapping(value = "work.details", method = RequestMethod.POST)
	public void WorkDetails(String submit, HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(user.getId());
		List<AttSelectModel> list = AttSelectService.attSelect(id);
		int count = list.size() - 1;
		if (count == -1) {
			log.info("****Error****");
		}
		String day = list.get(count).getDate1().toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse(day);
		TimeService.Submit(submit, id , date);
	}
	//超過勤務追加
	@ResponseBody
	@RequestMapping(value = "overWork.details", method = RequestMethod.POST)
	public void OverWorkDetails(String data, HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(user.getId());
		String[] tokens = data.split(",");
		Timestamp start = Timestamp.valueOf(tokens[0]);
		Timestamp end = Timestamp.valueOf(tokens[1]);
		String overclass = tokens[2];
		TimeService.Overwork(start, end, overclass, id);
	}

	// 安ウンビョル
	// ------------------------------------------------------------------------

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
	@GetMapping(value = "holidayApply")
	public String holidayApply(Model model) throws Exception {

		String employeeId = user.getId();
		// セッションIDでユーザー名を取得
		String employeeName = holidayService.getEmpName(employeeId);
		// 休暇申請テーブルのシリアルナンバーの中で最も大きい数字を表示
		int maxSeriesNum = holidayService.getMaxSeriesNum();

		model.addAttribute("employeeId", employeeId);
		model.addAttribute("employeeName", employeeName);
		model.addAttribute("seriesNum", maxSeriesNum);
		// セッションIDに該当するリストを読み込む
		model.addAttribute("list", holidayService.holidayList(Integer.valueOf(user.getId())));

		// 個人休暇申請
		return "holidayApplyView";
	}

	@PostMapping(value = "holidaySelect")
	public String holidaySelect(Model model, HttpServletRequest request) throws Exception {
		String employeeId = user.getId();
		// セッションIDでユーザー名を取得
		String employeeName = holidayService.getEmpName(employeeId);
		// 休暇申請テーブルのシリアルナンバーの中で最も大きい数字を表示
		int maxSeriesNum = holidayService.getMaxSeriesNum();

		model.addAttribute("employeeId", employeeId);
		model.addAttribute("employeeName", employeeName);
		model.addAttribute("seriesNum", maxSeriesNum);
		// セッションIDに該当するリストを読み込む
		model.addAttribute("list", holidayService.holidaySelect(request.getParameter("year")));

		return "holidayApplyView";
	}

	/**
	 * 
	 * @param request
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "holidayInsert")
	public String holidayInsert(HttpServletRequest request, Model model) throws Exception {

		// 個人休暇申請 beans
		HolidayApplyModel holidayVO = new HolidayApplyModel();

		// holidayApplyView.jspでデータを受け取ってbeansファイルに保存
		holidayVO.setSeriesNum(Integer.parseInt(request.getParameter("seriesNum")));
		holidayVO.setEmployeeId(Integer.parseInt(request.getParameter("employeeId")));
		holidayVO.setEmployeeName(request.getParameter("employeeName"));
		holidayVO.setYearTimeCode(Integer.parseInt(request.getParameter("yearTimeCode")));
		holidayVO.setFromDate(request.getParameter("fromDate"));
		holidayVO.setToDate(request.getParameter("toDate"));
		holidayVO.setGrounds(request.getParameter("grounds"));
		holidayVO.setRegistred(request.getParameter("employeeId"));

		holidayService.holidayInsert(holidayVO);

		// 個人休暇申請
		return "redirect:holidayApply";
	}

	@GetMapping(value = "holidayDelete")
	public String holidayDelete(@RequestParam("seriesNum") String seriesNum) {

		// holidayApplyView.jspでajaxに渡された配列(チェックされたリスト項目)をString配列に保存してint配列に変換
		String[] arrIdx = seriesNum.toString().split(",");
		int[] seriesNumArray = Arrays.stream(arrIdx).mapToInt(Integer::parseInt).toArray();

		// 配列アドレスに保存されているseriesNumとして選択項目をdbから削除
		for (int i = 0; i < arrIdx.length; i++) {
			holidayService.holidayDelete(seriesNumArray[i]);
		}

		// 個人休暇申請
		return "redirect:holidayApply";
	}
}
