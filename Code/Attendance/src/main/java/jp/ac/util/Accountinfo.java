package jp.ac.util;

import lombok.Data;

@Data
public class Accountinfo {
    private String id;
    private int grade;

    public Accountinfo(String id, int grade) {
        this.id = id;
        this.grade = grade;
    }
    public Accountinfo(String id) {
        this.id = id;
    }
    
}
