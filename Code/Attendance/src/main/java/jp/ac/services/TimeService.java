package jp.ac.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import jp.ac.beans.MemberModel;
import jp.ac.mappers.MemberMapper;
import jp.ac.mappers.TimeMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TimeService {
	@Autowired
	TimeMapper 時計mapper;
	
	public String Clocksaveatt(Timestamp Clock, int ID) throws Exception{
		return 時計mapper.Clocksaveatt(Clock, ID);
	}
	public String Clocksavelea(Timestamp Clock, int ID) throws Exception{
		return 時計mapper.Clocksavelea(Clock, ID);
	}
}
