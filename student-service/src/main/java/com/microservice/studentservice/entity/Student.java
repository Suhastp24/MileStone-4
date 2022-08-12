package com.microservice.studentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long studentId;
	private String studentName;
	private int studentAge;
	private String studentGender;
	private String studentStream;
	private long CollegeId;
	
	
	public long getStudentId() {
		return studentId;
	}



	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}





	public String getStudentGender() {
		return studentGender;
	}





	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}


	public String getStudentStream() {
		return studentStream;
	}


	public void setStudentStream(String studentStream) {
		this.studentStream = studentStream;
	}



	public long getCollegeId() {
		return CollegeId;
	}


	public void setCollegeId(long collegeId) {
		CollegeId = collegeId;
	}


	public Student(long studentId, String studentName, int studentAge, String studentGender, String studentStream,
			long collegeId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentStream = studentStream;
		CollegeId = collegeId;
	}

	public Student() {
		super();
	}

}
