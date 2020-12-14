package jp.ac.mappers;

import java.sql.Timestamp;

public interface TimeMapper {

	public String clockSaveAtt(Timestamp clock, int id) throws Exception;
	public String clockSaveLea(Timestamp clock, int id) throws Exception;
}
