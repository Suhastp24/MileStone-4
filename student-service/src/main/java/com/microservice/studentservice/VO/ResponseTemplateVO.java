package com.microservice.studentservice.VO;

import com.microservice.studentservice.entity.Student;

public class ResponseTemplateVO {
  
	private College college;
	private Student student;
	
	public ResponseTemplateVO(College college, Student student) {
		super();
		this.college = college;
		this.student = student;
	}
	
	public ResponseTemplateVO() {
	super();
	
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
