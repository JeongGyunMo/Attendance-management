package jp.ac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import jp.ac.DAO.JoinDAOImpl;
import jp.ac.beans.joinbean;

@Service
public class JoinServiceImpl implements JoinService{
	@Autowired
	//JoinDAOImpl JoinDAO;
	
	//ȸ������
	@Override
	public void Join(joinbean bean) {
		System.out.println("ȸ������ ���� ����");
		//JoinDAO.join(dto);
		System.out.println("ȸ������ ���� ��");
	}
}