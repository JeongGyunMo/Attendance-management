package jp.ac.controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.ac.services.����η��٥�service;

@Controller
@RequestMapping("����η��٥�")
public class ����η��٥�controller {

	private ����η��٥�service ����η��٥�service; 
	
	@GetMapping
	public String index(@PathVariable String id, @PathVariable String pass) {
		model.addAttribute("����η��٥�List",����η��٥�service.findall(id));
		return "����η��٥�"��
	}
}
