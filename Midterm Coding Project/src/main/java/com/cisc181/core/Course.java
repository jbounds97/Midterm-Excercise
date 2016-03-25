package com.cisc181.core;

import java.util.UUID;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private  com.cisc181.eNums.eMajor Major;
	
	public UUID getCourseID() {
		return CourseID;
	}

	private void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	private void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	private void setGradePoints(int GradePoints) {
		this.GradePoints = GradePoints;
	}
	//Even if no values are passed right away, still want UUID to be generated
	public Course(){
		this.CourseID = UUID.randomUUID();
	}
	/**
	 * 
	 * @param CourseName
	 * @param GradePoints
	 * @param Major
	 */
	public Course(String CourseName, int GradePoints, com.cisc181.eNums.eMajor Major){
		this.CourseID = UUID.randomUUID();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}
	
}
