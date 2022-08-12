package com.microservice.studentservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.microservice.studentservice.entity.Student;
import com.microservice.studentservice.repository.StudentRepository;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentRepositoryTest {
	
	
	@Autowired
	private StudentRepository studentRespository;
	
	@Test
	@Order(1)
	@Rollback(value=false)
	public void saveStudentTest() {
		
		Student student = Student.builder()
			.studentName("ManojRaj")
			.studentAge(24)
			.studentGender("Male")
			.studentStream("Science")
			.build();
				
	 studentRepository.save(student);
		
		Assertions.assertThat(student.getStudentId()).isGreaterThan(0);
	}
	
	@Test
	@Order(2)
	@Rollback(value = false)
	public void getStudentTest() {
		
		
		Student student = studentRepository.findByStudentId(1L).get();
		
		Assertions.assertThat(student.getStudentId()).isEqualTo(1L);
	}
	

}
