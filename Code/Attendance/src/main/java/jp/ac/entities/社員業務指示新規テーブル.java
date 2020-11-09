/*
 * package jp.ac.entities;
 * 
 * import java.math.BigDecimal; import java.sql.Timestamp;
 * 
 * import javax.persistence.Entity; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * import lombok.Data; import lombok.NoArgsConstructor;
 * 
 * @Data
 * 
 * @NoArgsConstructor
 * 
 * @Entity
 * 
 * @Table(name = "empbusinorders") public class 社員業務指示新規テーブル { //외래키 private
 * BigDecimal departcode;//部署コード private String employeename;//社員名 private
 * Timestamp fromdate;//開始日 private Timestamp todate;//終了日 private BigDecimal
 * businessdescode;//業務内容コード private String registred;//登録者 private Timestamp
 * registredtime;//登録日時 private String updated;//更新者 private Timestamp
 * updatedtime;//更新日時
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "employeeid") private 社員マスタ id; }
 */