package jp.ac.service.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jp.ac.dto.loginVO;;
	@Repository("LoginDAO")
	public class login_serviceDAO {
		@Autowired
		private SqlSession mybatis;
		
		public loginVO getInfo(){
			return mybatis.selectOne("login.getInfo");
		}
}
