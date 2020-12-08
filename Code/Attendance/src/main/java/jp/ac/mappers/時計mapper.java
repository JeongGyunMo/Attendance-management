package jp.ac.mappers;

import java.sql.Timestamp;

public interface 時計mapper {

	public String Clocksaveatt(Timestamp Clock, int ID) throws Exception;
	public String Clocksavelea(Timestamp Clock, int ID) throws Exception;
}
