package jp.ac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.beans.joinbean;
import jp.ac.mappers.mainmapper;

@Service
public class JoinServiceImpl implements JoinService{
	@Autowired
	private mainmapper main;
	
    @Transactional
    public void save(joinbean bean) {
    	main.join(bean);
    }
}