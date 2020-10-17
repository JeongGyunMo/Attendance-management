package jp.ac.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "社員マスタ")
public class 勤怠管理TBL {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int 社員ID;
	
	private String 部署コード;
	private String 社員名;
	private String ログインID;
	private String ログインパスワード;
	private String フリガナ;
	private String 郵便番号;
	private String 住所1;
	private String 住所2;
	private String 電話番号;
	private String 携帯番号;
	private String メール;
	private String 登録者;
	private Date 登録日時;
	private String 更新者;
	private Date 更新日時;
	
}