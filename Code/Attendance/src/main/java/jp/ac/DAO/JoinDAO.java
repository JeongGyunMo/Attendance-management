package jp.ac.DAO;

import java.util.List;
import javax.servlet.http.HttpSession;
import jp.ac.DTO.JoinDTO;
public interface JoinDAO {
	// 회원가입 메소드
	public void JoinMethod(JoinDTO vo);
}
