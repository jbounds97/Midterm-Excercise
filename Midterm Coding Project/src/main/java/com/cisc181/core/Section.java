package com.cisc181.core;
import java.util.UUID;
public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	private void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}
	private void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}
	private void setSectionID(UUID SectionID) {
		this.SectionID = SectionID;
	}
	private void setRoomID(int RoomID) {
		this.RoomID = RoomID;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	
	//Even if no values are passed right away, still want UUID to be generated
		public Section(){
			this.CourseID = UUID.randomUUID();
			this.SemesterID = UUID.randomUUID();
			this.SectionID = UUID.randomUUID();
		}
		public Section(int RoomID, UUID CourseID, UUID SemesterID){
			this.RoomID = RoomID;
			this.CourseID = CourseID;
			this.SemesterID = SemesterID;
			this.SectionID = UUID.randomUUID();
		}
}
