package com.example.onetomany;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String course_name;
	
	
	public Courses(int id, String course_name) {
		
		this.id = id;
		this.course_name = course_name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	
	public Courses() {
		// TODO Auto-generated constructor stub
	}

}
