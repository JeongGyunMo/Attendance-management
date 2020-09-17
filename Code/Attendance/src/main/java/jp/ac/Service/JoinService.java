package jp.ac.Service;

import jp.ac.util.JoinRequest;

public interface JoinService {
	void register(JoinRequest regReq) throws Exception;
}
