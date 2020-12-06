package jp.ac.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import jp.ac.beans.会員登録model;
import jp.ac.mappers.会員登録mapper;
import jp.ac.mappers.時計mapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class 時計service {
	@Autowired
	時計mapper 時計mapper;
	
	public String Clocksave(Timestamp Clock) throws Exception{
		return 時計mapper.Clocksave(Clock);
	}
}
