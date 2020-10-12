package jp.ac.controller;
import java.text.DateFormat;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jp.ac.beans.勤怠管理model;
import jp.ac.services.勤怠管理service;
@Controller
@RequestMapping("勤怠管理")
public class 勤怠管理controller {

	private 勤怠管理service 勤怠管理service; 
	
	@GetMapping
	public String index(Model model, 勤怠管理model id) {
		List<勤怠管理model> list = 勤怠管理service.findall(id);
		model.addAttribute("勤怠管理List",list);
		return "共通コード";
	}
}
