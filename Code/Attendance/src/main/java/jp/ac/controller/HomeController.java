package jp.ac.controller;

import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.ac.beans.LoginModel;
import jp.ac.beans.MemberModel;
import jp.ac.services.MemberService;
import jp.ac.services.TimeService;
import jp.ac.util.Accountinfo;
import jp.ac.services.LoginService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
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

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "ホーム";
	}

	@RequestMapping(value = "sign", method = RequestMethod.GET)
	public String sing(Locale locale, Model model) {
		return "会員登録";
	}

	@PostMapping("register")
	public String register(MemberModel Account) throws Exception {
		MemberService.save(Account);
		return "ホーム";
	}

	@PostMapping("/login")
	public ModelAndView login(LoginModel id, HttpSession session) throws Exception {
		String employeeId = LoginService.logincheck(id, session);
		ModelAndView mav = new ModelAndView();
		if (employeeId != null) {
			mav.setViewName("勤務登録");
			mav.addObject("msg", "success");
		} else {
			mav.setViewName("ホーム");
			mav.addObject("msg", "failure");
		}
		user.setId(employeeId);
		return mav;
	}

	@ResponseBody
	@RequestMapping(value = "time.att", method = RequestMethod.POST)
	public void Clockatt(Timestamp clock, HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(user.getId());
		TimeService.Clocksaveatt(clock, id);

	}

	@ResponseBody
	@RequestMapping(value = "time.lea", method = RequestMethod.POST)
	public void Clocklea(Timestamp clock, HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(user.getId());
		TimeService.Clocksavelea(clock, id);
	}
}
