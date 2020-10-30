package jp.ac.entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Times")
public class 勤怠テーブル {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int timeid; //勤怠ID;
	//외래키 
	private Timestamp dates;//日付
	private Timestamp attendtime;//出勤時刻
	private Timestamp leavetime;//退勤時刻
	private String busindesccode;//業務内容コード
	private BigDecimal overtimeclass;//超過勤怠区分
	private Timestamp overtimestarttime;//超過開始時刻
	private Timestamp overtimeendtime;//超過終了時刻
	private String registred;//登録者
	private Timestamp registredtime;//登録日時
	private String updated;//更新者
	private Timestamp updatedtime;//更新日時
	
	@ManyToOne
	@JoinColumn(name = "employeeid")
	private 社員マスタ id;
}
