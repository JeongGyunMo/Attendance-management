package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.beans.勤怠管理model;
import jp.ac.mappers.勤怠管理mapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class 勤怠管理service {
	@Autowired
	final private 勤怠管理mapper 勤怠管理mapper;

	public 勤怠管理service() { this.勤怠管理mapper = new 勤怠管理mapper(); }

	@Transactional
	public void findall(勤怠管理model Account){
		勤怠管理mapper.findAII(Account);
	}
}
