package jp.ac.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Locale;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.ac.beans.Test;
import jp.ac.beans.会員登録model;
import jp.ac.services.TestService;
import jp.ac.services.会員登録service;

@Controller
public class HomeController {
 
    @Autowired
    TestService testService;
	@Autowired
	private 会員登録service service; 
    
    
    @RequestMapping(value = "/" , method = RequestMethod.GET) 
    public String home() {
        return "ホーム";
    }
	@RequestMapping(value = "sign", method = RequestMethod.GET)
	public String sing(Locale locale, Model model) {
		return "会員登録";
	}
    @RequestMapping("/query")
    public @ResponseBody List<Test> query() throws Exception{
        return testService.getAll();
    }
	@PostMapping("register")
	public String register(会員登録model Account) throws Exception {
		//List<勤怠管理model> list =
		service.save(Account);
		//model.addAttribute("勤怠管理List",list);
		return "ホーム";
	}
} 
