package com.rajesh.springboot.course_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Rajesh Acharya
 *
 *         Date Jun 14, 2018
 */
// This annotation tells this is the starting point of the application
@SpringBootApplication
public class CourseApiApp {
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}
