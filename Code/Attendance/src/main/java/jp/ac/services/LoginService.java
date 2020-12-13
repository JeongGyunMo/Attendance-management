package jp.ac.services;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jp.ac.mappers.LoginMapper;
import lombok.RequiredArgsConstructor;
import jp.ac.beans.LoginModel;

@Service
@RequiredArgsConstructor
public class LoginService {
	@Autowired
	LoginMapper ログインmapper;

	public String logincheck(LoginModel ID, HttpSession session) throws Exception {
		String Eid = ログインmapper.logincheck(ID);

		/*
		 * if (result) { ログインmodel user = viewMember(ID); session.setAttribute("userid",
		 * user.getId()); }
		 */

		return Eid;
	}

}
