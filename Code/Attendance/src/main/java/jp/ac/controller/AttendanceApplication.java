package jp.ac.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class AttendanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendanceApplication.class, args);
	}	
}
