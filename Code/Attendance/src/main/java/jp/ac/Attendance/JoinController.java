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
    //�޼��� �ۼ��ϱ� @Model ������̼��� ���� testPage ����
    public String insert_data(@ModelAttribute joinVO join){
        System.out.print(join.toString()); //view���� ����� �� �����ִ��� Ȯ���ϱ�        
        //joimapper.insert_data(join);
        return "redirect:/attendance_login";  //��û ó�� �� testPage�� �ٽ� ����
    }
}
