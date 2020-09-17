package jp.ac.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import jp.ac.DAO.JoinDAO;
import jp.ac.VO.JoinVO;
import jp.ac.util.JoinRequest;

@Service("JoinService")
public class JoinServiceImpl implements JoinService {
	@Resource(name="JoinDAO")
    private JoinDAO joinDAO;
 
    @Override
    public void register(JoinRequest regReq) throws Exception {
        JoinVO id = joinDAO.selectById(regReq.getId());
        joinDAO.insertUser(regReq);
    }


}
