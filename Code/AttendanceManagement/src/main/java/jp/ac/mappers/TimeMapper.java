package jp.ac.mappers;

import java.sql.Timestamp;
import java.util.Date;

public interface TimeMapper {

	public String clockSaveAtt(Timestamp clock, int id) throws Exception;
	// 出勤時間記録

	public String clockSaveLea(Timestamp clock,Date day, int id) throws Exception;
	// 退勤時間記録
	
	public String submit(String submit, int id, Date day) throws Exception;
	// 勤務内容
	
	public String Overwork(Timestamp start,Timestamp end, String overclass,  int id) throws Exception;
	// 超過勤務追加
}
