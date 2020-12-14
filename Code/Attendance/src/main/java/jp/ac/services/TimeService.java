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
	TimeMapper TimeMapper;
	
	public String Clocksaveatt(Timestamp clock, int id) throws Exception{
		return TimeMapper.clockSaveAtt(clock, id);
	}
	public String Clocksavelea(Timestamp clock, int id) throws Exception{
		return TimeMapper.clockSaveLea(clock, id);
	}
}
