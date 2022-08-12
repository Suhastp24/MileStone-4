package com.microservice.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.studentservice.VO.ResponseTemplateVO;
import com.microservice.studentservice.entity.Student;
import com.microservice.studentservice.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {
	
	 @Autowired
		public StudentService studentService;
	    
	     @PostMapping("/")
	    public Student saveStudent(@RequestBody Student student) {
	    	return studentService.saveStudent(student);
	    }
	     @GetMapping("{id}")
	     public ResponseTemplateVO getStudentWithCollege(@PathVariable Long studentId) {
	    	 return studentService.getStudentWithCollege(studentId);
	     }

}
