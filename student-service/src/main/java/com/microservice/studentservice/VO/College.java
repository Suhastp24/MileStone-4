package com.microservice.studentservice.VO;

public class College {

	private long collegeId;
	private String collegeName;
	private int totalnoofstudents;
	
	
	public long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getTotalnoofstudents() {
		return totalnoofstudents;
	}
	public void setTotalnoofstudents(int totalnoofstudents) {
		this.totalnoofstudents = totalnoofstudents;
	}
	
	public College(long collegeId, String collegeName, int totalnoofstudents) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.totalnoofstudents = totalnoofstudents;
	}
	
	public College() {
		super();
	}
	
	
}
