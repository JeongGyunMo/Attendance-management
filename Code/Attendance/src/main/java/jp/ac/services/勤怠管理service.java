package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.beans.勤怠管理model;
import jp.ac.mappers.勤怠管理mapper;

@Service
public class 勤怠管理service {
	@Autowired
	private 勤怠管理mapper 勤怠管理mapper;
	
	@Transactional
	public List<勤怠管理model> findall(勤怠管理model Account){
		return 勤怠管理mapper.findAII(Account);
	}
}
