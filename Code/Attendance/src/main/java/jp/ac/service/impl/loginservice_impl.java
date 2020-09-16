package jp.ac.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jp.ac.service.dao.login_serviceDAO;
import jp.ac.dto.loginVO;
import jp.ac.service.login_service;

	@Repository
public class loginservice_impl implements login_service {
	@Autowired
	private login_serviceDAO loginDAO;
	@Override
	public loginVO getinfo(){
		
		return loginDAO.getInfo();
	}
}
