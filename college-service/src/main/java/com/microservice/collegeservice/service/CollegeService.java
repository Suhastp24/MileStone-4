package com.microservice.collegeservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.collegeservice.entity.College;
import com.microservice.collegeservice.repository.CollegeRepository;

@Service
public class CollegeService  {
	
	@Autowired
	private CollegeRepository collegeRepository;

	public College saveCollege (College college) {
	
		return collegeRepository.save(college);
	}

	public College findCollegeById(Long collegeId) {
	
		return collegeRepository.findByCollegeId(collegeId);
	}


}
