package jp.ac.controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.ac.beans.ÐÃ÷½Î·×âmodel;
import jp.ac.beans.ÐÃ÷½Î·×âÙ¥á¬model;
import jp.ac.services.ÐÃ÷½Î·×âÙ¥á¬service;

@Controller
@RequestMapping("ÐÃ÷½Î·×âÙ¥á¬")
public class ÐÃ÷½Î·×âÙ¥á¬controller {

	private ÐÃ÷½Î·×âÙ¥á¬service ÐÃ÷½Î·×âÙ¥á¬service; 
	
	@GetMapping
	public String index(Model model, ÐÃ÷½Î·×âmodel id) {
		List<ÐÃ÷½Î·×âÙ¥á¬model> list = ÐÃ÷½Î·×âÙ¥á¬service.findall(id);
		model.addAttribute("ÐÃ÷½Î·×âÙ¥á¬List",list);
		return "ÐÃ÷½Î·×âÙ¥á¬show"£»
	}
}
