package jp.ac.VO;

import java.util.Date;
import lombok.*;

@Data
public class JoinVO {
	private String EMPLOYEE_ID;
	private String PASSWORD;
	private String EMPLOYEE_NUMBER;
	private String EMPLOYEE_NM;
	private Date EMPLOYEE_DATE;
	private Date SCHEDULE_TO_DAY;
	private String INPUT_ID;
	private Date INPUT_DATE;
	private String UPDATE_ID;
	private Date UPDATE_DATE;
}
