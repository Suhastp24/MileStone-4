package com.microservice.studentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.studentservice.VO.College;
import com.microservice.studentservice.VO.ResponseTemplateVO;
import com.microservice.studentservice.entity.Student;
import com.microservice.studentservice.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> findAllOrderByNameAsc(){
		var sort = new Sort (sort.Direction.ASC, "name");
		return repository.findAllOrderByNameAsc();
	}

	public ResponseTemplateVO getStudentWithCollege(Long studentId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Student student = studentRepository.findByStudentId(studentId);
		

	   College college = restTemplate.getForObject("http:/COLLEGE-SERVICE/colleges/" + student.getCollegeId() , College.class);
		
		vo.setStudent(student);
		vo.setCollege(college);
		
		return vo;
		
}


}
