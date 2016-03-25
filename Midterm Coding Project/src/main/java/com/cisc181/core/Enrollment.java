package com.cisc181.core;
import java.util.UUID;
public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private void setSectionID(UUID SectionID) {
		this.SectionID = SectionID;
	}

	private void setSTudentID(UUID StudentID) {
		this.StudentID = StudentID;
	}

	private void setEnrollmentID(UUID EnrollmentID) {
		this.EnrollmentID = EnrollmentID;
	}

	private void setGrade(double Grade) {
		this.Grade = Grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	private Enrollment(){}
	
	public Enrollment(UUID StudentID, UUID SectionID, double Grade){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
		this.Grade = Grade;
	}
	
	
}
