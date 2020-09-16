package jp.ac.Attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ac.dto.joinVO;

@Controller
public class JoinController {
	
	@RequestMapping(value = "/page/join_data", method = RequestMethod.POST)
    //메서드 작성하기 @Model 어노테이션을 통해 testPage 생성
    public String insert_data(@ModelAttribute joinVO join){
        System.out.print(join.toString()); //view에서 제대로 값 던져주는지 확인하기        
        //joimapper.insert_data(join);
        return "redirect:/attendance_login";  //요청 처리 후 testPage로 다시 연결
    }
}
