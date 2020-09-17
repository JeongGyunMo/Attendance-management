package jp.ac.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.ac.DAO.JoinDAOImpl;
import jp.ac.DTO.JoinDTO;

@Service
public class JoinServiceImpl implements JoinService{
	@Autowired
	JoinDAOImpl JoinDAO;
	
	//회원가입
	@Override
	public void Join(JoinDTO dto) {
		System.out.println("회원가입 서비스 시작");
		JoinDAO.join(dto);
		System.out.println("회원가입 서비스 끝");
	}
}