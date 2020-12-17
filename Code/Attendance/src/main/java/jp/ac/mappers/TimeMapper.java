package jp.ac.mappers;

import java.sql.Timestamp;

public interface TimeMapper {

	public String clockSaveAtt(Timestamp clock, int id) throws Exception;
	// 出勤時間記録

	public String clockSaveLea(Timestamp clock, int id) throws Exception;
	// 退勤時間記録
}
