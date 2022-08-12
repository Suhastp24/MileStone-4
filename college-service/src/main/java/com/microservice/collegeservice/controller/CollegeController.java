package com.microservice.collegeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.collegeservice.entity.College;
import com.microservice.collegeservice.service.CollegeService;


@RestController
@RequestMapping("/colleges")
public class CollegeController {

		@Autowired
		 private CollegeService collegeService;
		 
		 @PostMapping("/")
		 public College saveCollege(@RequestBody College college) {

			 return collegeService.saveCollege(college);
			 
		 }
		 
		 @GetMapping("/{id}")
		 public College findCollegeById(@PathVariable ("id")Long collegeId) {
			 return collegeService.findCollegeById(collegeId);
		 }

}
