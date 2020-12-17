package jp.ac.util;

import lombok.Data;

@Data
public class Accountinfo {
    private String id;
    private int grade;
    //ログインした人の情報
    
    public Accountinfo() {
        this.id = "123";
        this.grade = 1;
    }
}
