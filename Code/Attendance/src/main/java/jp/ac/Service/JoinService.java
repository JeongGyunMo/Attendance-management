package jp.ac.Service;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jp.ac.DTO.JoinDTO;

public interface JoinService { 
	// ȸ������ ���μ���
	public void JoinProcess(JoinDTO dto);
}