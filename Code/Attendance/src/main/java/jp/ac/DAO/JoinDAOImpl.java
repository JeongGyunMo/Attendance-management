package jp.ac.DAO;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import jp.ac.DTO.JoinDTO;

@Repository
public class JoinDAOImpl implements JoinDAO{
	@Inject
	private SqlSession sqlSession;
	@Override
	public void join(JoinDTO dto) {
		System.out.println("ȸ������ dao ����");
		sqlSession.insert("JoinMapper.join", dto);
		System.out.println("ȸ������ dao ��");
	}
}
