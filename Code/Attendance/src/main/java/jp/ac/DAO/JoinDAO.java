package jp.ac.DAO;

import org.springframework.stereotype.Repository;
import jp.ac.VO.JoinVO;
import jp.ac.util.JoinRequest;
import jp.ac.DAO.AbstractDAO;

@Repository("JoinDAO")
public class JoinDAO {
	AbstractDAO a = new AbstractDAO();
    public JoinVO selectById(String id) {
        return (JoinVO)a.selectOne("user.selectById", id);
    }
 
    public void insertUser(JoinRequest regReq) {
        a.insert("user.register", regReq);
    }

}
