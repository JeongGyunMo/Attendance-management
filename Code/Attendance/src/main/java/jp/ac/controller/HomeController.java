package jp.ac.controller;

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
import jp.ac.beans.ログインmodel;
import jp.ac.beans.会員登録model;
import jp.ac.services.会員登録service;
import jp.ac.services.ログインservice;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
 
	@Autowired
	private 会員登録service service; 
    @Autowired
    private ログインservice ログインservice;
    
    @RequestMapping(value = "/" , method = RequestMethod.GET) 
    public String home() {
        return "ホーム";
    }
	@RequestMapping(value = "sign", method = RequestMethod.GET)
	public String sing(Locale locale, Model model) {
		return "会員登録";
	}

	@PostMapping("register")
	public String  register(会員登録model Account) throws Exception {
		service.save(Account);
		return "ホーム";
	}
	@PostMapping("/login")
	public ModelAndView login(ログインmodel ID, HttpSession session) throws Exception {
		boolean result = ログインservice.logincheck(ID,session);
		ModelAndView mav = new ModelAndView();
		if(result == true) {
			mav.setViewName("休日管理（月）");
			mav.addObject("msg", "success");
		}else {
			mav.setViewName("ホーム");
			mav.addObject("msg", "failure");
		}
		return mav;
	}
} 
