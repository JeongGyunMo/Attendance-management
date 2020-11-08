package jp.ac.controller;
import java.text.DateFormat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	//社員マスタRepository 社員マスタRepository;


}
