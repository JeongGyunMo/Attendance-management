package jp.ac.DAO;

import javax.servlet.http.HttpSession;
import org.mybatis.spring.SqlSessionTemplate;
import jp.ac.DTO.JoinDTO;

public class JoinDAOImpl implements JoinDAO {
	private SqlSessionTemplate sqlSession;

	public JoinDAOImpl() {
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void JoinMethod(JoinDTO dto) {
		sqlSession.insert("join.new", dto);
	}
}