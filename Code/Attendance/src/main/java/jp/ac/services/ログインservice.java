package jp.ac.services;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jp.ac.mappers.ログインmapper;
import lombok.RequiredArgsConstructor;
import jp.ac.beans.ログインmodel;

@Service
@RequiredArgsConstructor
public class ログインservice {
	@Autowired
	ログインmapper ログインmapper;

	public boolean logincheck(ログインmodel ID, HttpSession session) throws Exception {
		boolean result = true;
		String name = ログインmapper.logincheck(ID);
		System.out.println(name);
		if(name == null) {
			result = false;
		}
		/*
		 * if (result) { ログインmodel user = viewMember(ID); session.setAttribute("userid",
		 * user.getId()); }
		 */

		return result;
	}

}
