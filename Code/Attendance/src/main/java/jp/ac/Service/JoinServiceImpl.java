package jp.ac.Service;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jp.ac.DAO.JoinDAO;
import jp.ac.DTO.JoinDTO;

public class JoinServiceImpl implements JoinService {
	private JoinDAO dao;

	public void setDao(JoinDAO dao) { this.dao = dao; } 
	@Override
	public void JoinProcess(JoinDTO dto) {
		dao.JoinMethod(dto);
	}
}
