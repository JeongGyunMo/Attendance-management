package jp.ac.Attendance;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.ac.Service.JoinService;
import jp.ac.util.JoinRequest;
import jp.ac.util.JoinValidator;

@Controller
public class JoinController {
	   
	   @Resource(name="JoinService")
	   private JoinService userSer;
	   @RequestMapping("/join/step1")
	    public ModelAndView step3(JoinRequest regReq, Errors errors) throws Exception{
	        new JoinValidator().validate(regReq, errors);
	        if(errors.hasErrors()) {
	            ModelAndView mv = new ModelAndView("user/register/step2");
	            return mv;
	        }
	        ModelAndView mv = new ModelAndView("user/register/step3");
	        return mv;
	    }
}
