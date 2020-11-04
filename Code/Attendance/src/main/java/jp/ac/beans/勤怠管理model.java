package jp.ac.beans;

import java.sql.Timestamp;

import lombok.Data;
@Data
public class 勤怠管理model {
	private int employeeid; //社員ID;
	private String departcode; //部署コード;
	private String employname; //社員名;
	private String loginid; //ログインID;
	private String loginpass; //ログインパスワード;
	private String phonetic; //フリガナ;
	private String zipcode; //郵便番号;
	private String address1; //住所1;
	private String address2; //住所2;
	private String phonenum; //電話番号;
	private String mobilenum; //携帯番号;
	private String email; //メール;
	private String registred; //登録者;
	private Timestamp registredtime; //登録日時;
	private String updated; //更新者;
	private Timestamp updatedtime; //更新日時;
}
