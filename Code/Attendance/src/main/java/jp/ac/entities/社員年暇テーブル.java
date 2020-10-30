package jp.ac.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "empyearfreetime")
public class 社員年暇テーブル {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seriesnum; //一連番号;
	//외래키
	private String employeename;//社員名
	private BigDecimal yeartimecode;//年暇コード
	private Timestamp fromdate;//開始日
	private Timestamp todate;//終了日
	private String grounds;//事由
	private BigDecimal days;//日数
	private BigDecimal approvalcode;//承認区分コード
	private String registred;//登録者
	private Timestamp registredtime;//登録日時
	private String updated;//更新者
	private Timestamp updatedtime;//更新日時
	
	@ManyToOne
	@JoinColumn(name = "employeeid")
	private 社員マスタ id;
}
