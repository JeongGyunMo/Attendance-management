package jp.ac.Attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.ac.service.login_service;

@Controller
public class LoginController {
	@Autowired
	login_service loginService;
	@RequestMapping(value="/page/login_data", method = RequestMethod.POST)
	public String loginPage() {
		
		return "/login/loginPage";
	}
	@RequestMapping(value="/login/accessDenied.do")
	public String accessDeniedPage() throws Exception {
		return "/login/accessDenied";
	}
}

