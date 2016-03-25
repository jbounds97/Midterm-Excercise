package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	
	public UUID getSemesterID() {
		return SemesterID;
	}

	private void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	private void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	private void setEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}

	//Even if no values are passed right away, still want UUID to be generated
	public Semester(){
		this.SemesterID = UUID.randomUUID();
	}
	public Semester(Date StartDate, Date EndDate){
		this.SemesterID = UUID.randomUUID();
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
}
