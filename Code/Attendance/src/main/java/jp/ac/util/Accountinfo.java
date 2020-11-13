package jp.ac.util;

import lombok.Data;

@Data
public class Accountinfo {
    private String id;
    private String name;
    private int grade;

    public Accountinfo(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public Accountinfo(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
