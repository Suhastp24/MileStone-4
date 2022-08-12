package com.microservice.collegeservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservice.collegeservice.entity.College;

@Repository
public interface CollegeRepository  extends JpaRepository<College, Long>{
    College findByCollegeId(long collegeId);

    @Query("FROM College ORDER BY studentName")
	List<College> findAllOrderByCollegeAsc();	

}
