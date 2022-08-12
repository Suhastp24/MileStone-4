package com.microservice.studentservice.service;

import java.util.List;

import com.microservice.studentservice.entity.Student;

public interface StudentImpl {
	List<Student> findAllOderByStudentNameAsc();
	
	

}
