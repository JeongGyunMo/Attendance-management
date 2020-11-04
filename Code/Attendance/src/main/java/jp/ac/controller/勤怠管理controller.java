package jp.ac.controller;
import java.text.DateFormat;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.ac.beans.勤怠管理model;
import jp.ac.services.勤怠管理service;
import jp.ac.entities.社員マスタRepository;
import jp.ac.entities.社員マスタ;

@Controller
@RequestMapping("勤怠管理")
public class 勤怠管理controller {

	private 勤怠管理service 勤怠管理service; 
	社員マスタRepository 社員マスタRepository;
	

	@PostMapping("/register")
	public void register(Model model, 勤怠管理model Account) {
		List<勤怠管理model> list = 勤怠管理service.findall(Account);
		model.addAttribute("勤怠管理List",list);
		
	}
}
