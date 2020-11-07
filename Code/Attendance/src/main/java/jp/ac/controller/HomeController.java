package jp.ac.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ac.beans.勤怠管理model;
import jp.ac.entities.社員マスタRepository;
import jp.ac.services.勤怠管理service;
 
@Controller
public class HomeController {
	
	@Autowired
	private 勤怠管理service 勤怠管理serviceImpl; 
	//社員マスタRepository 社員マスタRepository;
	
    @RequestMapping("/")
    public String home() {
        return "ホーム";
    }
	@RequestMapping(value = "sign", method = RequestMethod.GET)
	public String sing(Locale locale, Model model) {
		return "新規加入";
	}
	
	@PostMapping("register")
	public String register(Model model, 勤怠管理model Account) {
		//List<勤怠管理model> list =
		勤怠管理serviceImpl.findall(Account);
		//model.addAttribute("勤怠管理List",list);
		return "ホーム";
	}
}
