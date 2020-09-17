package jp.ac.util;

import lombok.*;

@Data
public class JoinRequest {
	private String id;
	private String password;
	private String checkPw;
	private String number;
	private String name;
	
    //��й�ȣ Ȯ��
    public boolean isPwEqualToCheckPw() {
        return password.equals(checkPw);
    }
}
