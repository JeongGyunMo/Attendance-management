package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jp.ac.beans.Test;
import jp.ac.beans.会員登録model;
import jp.ac.mappers.会員登録mapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class 会員登録service {
	@Autowired
	会員登録mapper 会員登録mapper;
	
	public List<会員登録model> save(会員登録model Account) throws Exception{
		return 会員登録mapper.save(Account);
	}
}
