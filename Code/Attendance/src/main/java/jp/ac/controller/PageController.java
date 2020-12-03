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
public class PageController {
    
    @RequestMapping(value = "/休日管理(月)" , method = RequestMethod.GET) 
    public String 休日管理() throws Exception {
        return "休日管理(月)";
    }

    @RequestMapping(value = "/共通コード" , method = RequestMethod.GET) 
    public String 共通コード() throws Exception {
        return "共通コード";
    }
    
    @RequestMapping(value = "/職員管理" , method = RequestMethod.GET) 
    public String 職員管理() throws Exception {
        return "職員管理";
    }
    
    @RequestMapping(value = "/職員勤務照" , method = RequestMethod.GET) 
    public String 職員勤務照会() throws Exception {
        return "職員勤務照会";
    }
    
    @RequestMapping(value = "/勤務" , method = RequestMethod.GET) 
    public String 勤務() throws Exception {
        return "勤務登録";
    }
    
    @RequestMapping(value = "/個人休暇申請" , method = RequestMethod.GET) 
    public String 個人休暇申請() throws Exception {
        return "個人休暇申請";
    }
    
    @RequestMapping(value = "/個人休暇(代表)" , method = RequestMethod.GET) 
    public String 個人休暇() throws Exception {
        return "個人休暇(代表)";
    }
    
    @RequestMapping(value = "/社員業務指示" , method = RequestMethod.GET) 
    public String 職社員業務指示() throws Exception {
        return "社員業務指示";
    }

} 