package jp.ac.util;

import lombok.*;

@Data
public class JoinRequest {
	private String id;
	private String password;
	private String checkPw;
	private String number;
	private String name;
	
    //비밀번호 확인
    public boolean isPwEqualToCheckPw() {
        return password.equals(checkPw);
    }
}
