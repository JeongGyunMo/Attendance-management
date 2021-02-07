package jp.ac.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.bind.annotation.RestController;
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

	final static String FILE_PATH = "C:\\Users\\Public\\Downloads\\holidayApply.csv";

	// 今の日付を保存
	Date NowDay = new Date();
	SimpleDateFormat Format = new SimpleDateFormat("yyyy/MM/dd");
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
	// 会員登録
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

	// 勤務登録
	@RequestMapping(value = "/attInsertView", method = RequestMethod.GET)
	public String 勤務(Model model) throws Exception {
		// 現在、ログインしているID
		int id = Integer.parseInt(user.getId());
		// xmlで作成されたクエリーから出た内容をHomeControllerで貯蔵
		List<AttSelectModel> list = AttSelectService.attSelect(id);
		int count = list.size() - 1;
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
	public void Clocklea(Timestamp clock, HttpServletRequest request, Model model, HttpServletResponse response)
			throws Exception {
		// 現在、ログインしているID
		int id = Integer.parseInt(user.getId());
		// xmlで作成されたクエリーから出た内容をHomeControllerで貯蔵
		List<AttSelectModel> list = AttSelectService.attSelect(id);
		int count = list.size() - 1;
		if (count == -1) {
			log.info("****Error****");
		}
		// 最後の出勤記録を持ってきて退勤記録を入力
		String day = list.get(count).getDate1().toString();
		day = day.replace("/", "-");
		String att = list.get(count).getAttendTime().toString();
		String[] tokens = att.split(" ");
		Timestamp attend = Timestamp.valueOf(day + ' ' + tokens[1]);
		TimeService.Clocksavelea(clock, attend, id);
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
		// 最後の出勤記録を持ってきて勤務内容を入力
		String day = list.get(count).getDate1().toString();
		day = day.replace("/", "-");
		String att = list.get(count).getAttendTime().toString();
		String[] tokens = att.split(" ");
		Timestamp attend = Timestamp.valueOf(day + ' ' + tokens[1]);
		TimeService.Submit(submit, id, attend);
	}

	// 出退勤記録を持ってくる

	@RequestMapping(value = "time.bring", method = RequestMethod.GET)
	public String timePopup(String dateText, Model model) throws Exception {
		int id = Integer.parseInt(user.getId());
		// mv.setViewName("attInsertView");
		String date = dateText.replace("-", "/");
		// 勤務登録ページで選択した日付を記録
		user.setDateText(date);
		return "attInsertView";
	}

	// ポップアップページ表示
	@RequestMapping(value = "/timePopup", method = RequestMethod.GET)
	public String timePopup(Model model, String dateText) throws Exception {
		int id = Integer.parseInt(user.getId());
		List<AttSelectModel> list = AttSelectService.attSelect(id);
		String date = user.getDateText().replace("-", "/");
		for (int i = 0; i <= list.size() - 1; i++) {
			String date1 = list.get(i).getDate1();
			// 記録された日付を基準にデータを読み込む。
			if (date1.equals(date)) {
				date = date.replace("/", "-");
				model.addAttribute("list", list.get(i));
				model.addAttribute("Date", date);
				model.addAttribute("NowDate", NowDate);
				return "timePopup";
			}
		}
		// 入力された日付にデータがなければNULLを転送
		List<AttSelectModel> notList = null;
		model.addAttribute("list", notList);
		model.addAttribute("Date", date);
		model.addAttribute("NowDate", NowDate);
		// 初期化
		user.setDateText(null);
		return "timePopup";
	}

	// 勤務修正
	@ResponseBody
	@RequestMapping(value = "modification", method = RequestMethod.POST)
	public void OverWorkDetails(String data, HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(user.getId());
		List<AttSelectModel> list = AttSelectService.attSelect(id);
		int count = list.size() - 1;
		if (count == -1) {
			log.info("****Error****");
		}

		String[] tokensDate = data.split(",");
		String date = tokensDate[0].replace("-", "/");
		for (int i = 0; i <= list.size() - 1; i++) {
			String date1 = list.get(i).getDate1();
			date1 += ' ';
			// 全てのデータを修正するのではなく、
			// 出勤または退勤記録だけを修正する可能性があるため、
			// 前のデータを持っている。
			Timestamp start = list.get(i).getAttendTime();
			Timestamp end = list.get(i).getLeaveTime();
			String modificationClass = list.get(i).getBusindescCode();
			if (date1.equals(date)) {
				date = tokensDate[0].replace("/", "-");
				// ページで入力されたデータがない場合、PASSを送る。
				if (!tokensDate[1].isEmpty() && !tokensDate[1].equals("Pass")) {
					start = Timestamp.valueOf(date + tokensDate[1]);
				} else {
					String at = list.get(i).getAttendTime().toString();
					String[] startDate = at.split(" ");
					start = Timestamp.valueOf(date + startDate[1]);
				}
				if (!tokensDate[2].isEmpty() && !tokensDate[2].equals("Pass")) {
					end = Timestamp.valueOf(date + tokensDate[2]);
				} else {
					String le = list.get(i).getLeaveTime().toString();
					String[] endDate = le.split(" ");
					end = Timestamp.valueOf(date + endDate[1]);
				}
				if (!tokensDate[3].isEmpty() && !tokensDate[3].equals("Pass")) {
					modificationClass = tokensDate[3];
				}
				String day = list.get(i).getDate1().toString();
				day = day.replace("/", "-");
				String att = list.get(i).getAttendTime().toString();
				String[] tokensAtt = att.split(" ");
				Timestamp attend = Timestamp.valueOf(day + ' ' + tokensAtt[1]);
				TimeService.modificationTime(start, end, modificationClass, id, attend);
			}
		}
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
	public String holidayApply(Model model, HttpServletRequest request) throws Exception {

		String employeeId = user.getId();
		String employeeName = holidayService.getEmpName(employeeId);
		int maxSeriesNum = holidayService.getMaxSeriesNum();

		model.addAttribute("employeeId", employeeId);
		model.addAttribute("employeeName", employeeName);
		model.addAttribute("seriesNum", maxSeriesNum);
		model.addAttribute("type", holidayService.holidayType());

		int empId = Integer.valueOf(user.getId());
		String year = request.getParameter("year");
		String month = request.getParameter("month");

		model.addAttribute("year", year);
		model.addAttribute("month", month);
		log.info("year" + year);
		log.info("month" + month);
		model.addAttribute("list", holidayService.holidayList(empId, year, month));

		// 個人休暇申請
		return "holidayApplyView";
	}

	@PostMapping(value = "holidaySelect")
	public String holidaySelect(Model model, HttpServletRequest request) throws Exception {
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		return "redirect:holidayApply?year=" + year + "&month=" + month;
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

	@PostMapping(value = "holidaySave")
	public String holidaySave(HttpServletRequest request) throws Exception {

		File file = null;
		BufferedWriter bw = null;
		String newLine = System.lineSeparator();

		int empId = Integer.valueOf(user.getId());
		String year = request.getParameter("year");
		String month = request.getParameter("month");

		List<HolidayApplyModel> list = holidayService.holidayList(empId, year, month);

		try {
			file = new File(FILE_PATH);
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "SJIS"));
			;

			bw.write("一連番号, 社員ID, 社員名, 休日種類, 開始日, 終了日, 理由, 日数, 承認区分");
			bw.write(newLine);

			for (int a = 0; a < list.size(); a++) {
				list.get(a);
				bw.write(list.get(a).getSeriesNum() + ",");
				bw.write(list.get(a).getEmployeeId() + ",");
				bw.write(list.get(a).getEmployeeName() + ",");
				bw.write(list.get(a).getCodeName() + ",");
				bw.write(list.get(a).getFromDate().substring(0, 10) + ",");
				bw.write(list.get(a).getToDate().substring(0, 10) + ",");
				bw.write(list.get(a).getGrounds() + ",");
				bw.write(list.get(a).getDays() + ",");
				bw.write(list.get(a).getApprovalCode() + ",");
				bw.write(newLine);
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		bw.close();

		return "redirect:holidayApply";
	}
}
