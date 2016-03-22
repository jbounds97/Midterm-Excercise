package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import exceptions.PersonException;

public class Student_Test {
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Student> students = new ArrayList<Student>();
	
	@BeforeClass
	public static void setup() {
		
		Course course1 = new Course("ECON101",3,eMajor.BUSINESS);
		Course course2 = new Course("CISC181",3,eMajor.COMPSI);
		Course course3 = new Course("PHYS208",3,eMajor.PHYSICS);
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		
		Semester semester1 = new Semester(new Date(15,8,1), new Date(15,11,19));
		Semester semester2 = new Semester(new Date(16,1,8), new Date(16,4,26));
		semesters.add(semester1);
		semesters.add(semester2);
		
		
		Section section1 = new Section(5, course1.getCourseID(), semester1.getSemesterID());
		Section section2 = new Section(2, course2.getCourseID(), semester1.getSemesterID());
		Section section3 = new Section(4, course3.getCourseID(), semester1.getSemesterID());
		Section section4 = new Section(100, course1.getCourseID(), semester2.getSemesterID());
		Section section5 = new Section(500, course2.getCourseID(), semester2.getSemesterID());
		Section section6 = new Section(300, course3.getCourseID(), semester2.getSemesterID());
		
		sections.add(section1);
		sections.add(section2);
		sections.add(section3);
		sections.add(section4);
		sections.add(section5);
		sections.add(section6);
		
		try{
			Student student1 = new Student("John", "Michael", "Bounds", new Date(97,5,11), eMajor.COMPSI, "7 Someplace drive", "(555)555-5555","email@email.com");			
			Student student2 = new Student("A", "B", "C", new Date(33,5,25), eMajor.BUSINESS, "8 Aplace avenue", "(333)333-3333", "email@yahoo.com");
			Student student3 = new Student("D", "E", "F", new Date(100, 2, 12), eMajor.COMPSI, "11 road road", "(111)111-1111", "myemail@google.com");
			Student student4 = new Student("G", "H", "I", new Date(89,0,5), eMajor.PHYSICS, "99 drive drive", "(123)456-7890", "address@facebook.com");
			Student student5 = new Student("J", "K", "L", new Date(67, 10, 28), eMajor.NURSING, "100 Google Drive", "(098)765-4321", "website@internet.com");
			Student student6 = new Student("M", "N", "O", new Date(88, 5, 23), eMajor.CHEM, "123 Waffle Street", "(554)555-5555","Aloha@hawaii.gov");
			Student student7 = new Student("P", "Q", "R", new Date(34, 6, 23), eMajor.BUSINESS, "555 five place", "(444)555-5151", "five@five.net");
			Student student8 = new Student("S", "T", "U", new Date(99, 3, 3), eMajor.NURSING, "123 Computer Drive", "(123)123-1234", "onetwo@two.gov");
			Student student9 = new Student("V", "W", "X", new Date(55, 5, 5), eMajor.COMPSI, "44 Pancake Place", "(424)424-4242", "Apple@fruit.net");
			Student student10 = new Student("Y", "Z", "ABC", new Date(67, 3, 3), eMajor.BUSINESS, "2 Wall Street", "(999)999-9999", "Money@money.com");
			
			students.add(student1);
			students.add(student2);
			students.add(student3);
			students.add(student4);
			students.add(student5);
			students.add(student6);
			students.add(student7);
			students.add(student8);
			students.add(student9);
			students.add(student10);
		}
		catch(PersonException e){
			System.out.println("Error: " + e.getPerson().getFirstName() + " " + e.getPerson().getMiddleName() + " " + e.getPerson().getLastName() + ". Either the person you tried entering was over 100 years old,"
					+ " or his/her phone number was not a valid US number.");
		}
			}

	@Before
	public void setUp(){
		
	}
	
		
	@Test
	public void test() {
		//enrollment student_section
		Enrollment enrollment0_0 = new Enrollment(students.get(0).getStudentID(), sections.get(0).getSectionID(), 4.00);
		Enrollment enrollment0_1 = new Enrollment(students.get(0).getStudentID(), sections.get(1).getSectionID(), 3.67);
		Enrollment enrollment0_2 = new Enrollment(students.get(0).getStudentID(), sections.get(2).getSectionID(), 3.33);
		Enrollment enrollment0_3 = new Enrollment(students.get(0).getStudentID(), sections.get(3).getSectionID(), 3.00);
		Enrollment enrollment0_4 = new Enrollment(students.get(0).getStudentID(), sections.get(4).getSectionID(), 2.67);
		Enrollment enrollment0_5 = new Enrollment(students.get(0).getStudentID(), sections.get(5).getSectionID(), 2.33);
		Enrollment enrollment1_0 = new Enrollment(students.get(1).getStudentID(), sections.get(0).getSectionID(), 2.00);
		Enrollment enrollment1_1 = new Enrollment(students.get(1).getStudentID(), sections.get(1).getSectionID(), 1.67);
		Enrollment enrollment1_2 = new Enrollment(students.get(1).getStudentID(), sections.get(2).getSectionID(), 1.33);
		Enrollment enrollment1_3 = new Enrollment(students.get(1).getStudentID(), sections.get(3).getSectionID(), 1.00);
		Enrollment enrollment1_4 = new Enrollment(students.get(1).getStudentID(), sections.get(4).getSectionID(), .67);
		Enrollment enrollment1_5 = new Enrollment(students.get(1).getStudentID(), sections.get(5).getSectionID(), .00);
		Enrollment enrollment2_0 = new Enrollment(students.get(2).getStudentID(), sections.get(0).getSectionID(), 4.00);
		Enrollment enrollment2_1 = new Enrollment(students.get(2).getStudentID(), sections.get(1).getSectionID(), 3.33);
		Enrollment enrollment2_2 = new Enrollment(students.get(2).getStudentID(), sections.get(2).getSectionID(), 3.33);
		Enrollment enrollment2_3 = new Enrollment(students.get(2).getStudentID(), sections.get(3).getSectionID(), 3.);
		Enrollment enrollment2_4 = new Enrollment(students.get(2).getStudentID(), sections.get(4).getSectionID(), 1.00);
		Enrollment enrollment2_5 = new Enrollment(students.get(2).getStudentID(), sections.get(5).getSectionID(), 2.00);
		Enrollment enrollment3_0 = new Enrollment(students.get(3).getStudentID(), sections.get(0).getSectionID(), 3.00);
		Enrollment enrollment3_1 = new Enrollment(students.get(3).getStudentID(), sections.get(1).getSectionID(), 4.00);
		Enrollment enrollment3_2 = new Enrollment(students.get(3).getStudentID(), sections.get(2).getSectionID(), 2.33);
		Enrollment enrollment3_3 = new Enrollment(students.get(3).getStudentID(), sections.get(3).getSectionID(), 3.00);
		Enrollment enrollment3_4 = new Enrollment(students.get(3).getStudentID(), sections.get(4).getSectionID(), 3.67);
		Enrollment enrollment3_5 = new Enrollment(students.get(3).getStudentID(), sections.get(5).getSectionID(), 4.00);
		Enrollment enrollment4_0 = new Enrollment(students.get(4).getStudentID(), sections.get(0).getSectionID(), 3.67);
		Enrollment enrollment4_1 = new Enrollment(students.get(4).getStudentID(), sections.get(1).getSectionID(), 3.00);
		Enrollment enrollment4_2 = new Enrollment(students.get(4).getStudentID(), sections.get(2).getSectionID(), 1.33);
		Enrollment enrollment4_3 = new Enrollment(students.get(4).getStudentID(), sections.get(3).getSectionID(), 3.67);
		Enrollment enrollment4_4 = new Enrollment(students.get(4).getStudentID(), sections.get(4).getSectionID(), 4.00);
		Enrollment enrollment4_5 = new Enrollment(students.get(4).getStudentID(), sections.get(5).getSectionID(), 3.67);
		Enrollment enrollment5_0 = new Enrollment(students.get(5).getStudentID(), sections.get(0).getSectionID(), 3.33);
		Enrollment enrollment5_1 = new Enrollment(students.get(5).getStudentID(), sections.get(1).getSectionID(), 4.00);
		Enrollment enrollment5_2 = new Enrollment(students.get(5).getStudentID(), sections.get(2).getSectionID(), 2.67);
		Enrollment enrollment5_3 = new Enrollment(students.get(5).getStudentID(), sections.get(3).getSectionID(), 2.00);
		Enrollment enrollment5_4 = new Enrollment(students.get(5).getStudentID(), sections.get(4).getSectionID(), 1.67);
		Enrollment enrollment5_5 = new Enrollment(students.get(5).getStudentID(), sections.get(5).getSectionID(), 1.33);
		Enrollment enrollment6_0 = new Enrollment(students.get(6).getStudentID(), sections.get(0).getSectionID(), 4.00);
		Enrollment enrollment6_1 = new Enrollment(students.get(6).getStudentID(), sections.get(1).getSectionID(), 3.67);
		Enrollment enrollment6_2 = new Enrollment(students.get(6).getStudentID(), sections.get(2).getSectionID(), 3.33);
		Enrollment enrollment6_3 = new Enrollment(students.get(6).getStudentID(), sections.get(3).getSectionID(), 4.00);
		Enrollment enrollment6_4 = new Enrollment(students.get(6).getStudentID(), sections.get(4).getSectionID(), 2.67);
		Enrollment enrollment6_5 = new Enrollment(students.get(6).getStudentID(), sections.get(5).getSectionID(), 3.00);
		Enrollment enrollment7_0 = new Enrollment(students.get(7).getStudentID(), sections.get(0).getSectionID(), 3.33);
		Enrollment enrollment7_1 = new Enrollment(students.get(7).getStudentID(), sections.get(1).getSectionID(), 3.33);
		Enrollment enrollment7_2 = new Enrollment(students.get(7).getStudentID(), sections.get(2).getSectionID(), 3.33);
		Enrollment enrollment7_3 = new Enrollment(students.get(7).getStudentID(), sections.get(3).getSectionID(), 3.33);
		Enrollment enrollment7_4 = new Enrollment(students.get(7).getStudentID(), sections.get(4).getSectionID(), 3.33);
		Enrollment enrollment7_5 = new Enrollment(students.get(7).getStudentID(), sections.get(5).getSectionID(), 3.33);
		Enrollment enrollment8_0 = new Enrollment(students.get(8).getStudentID(), sections.get(0).getSectionID(), 3.67);
		Enrollment enrollment8_1 = new Enrollment(students.get(8).getStudentID(), sections.get(1).getSectionID(), 3.67);
		Enrollment enrollment8_2 = new Enrollment(students.get(8).getStudentID(), sections.get(2).getSectionID(), 4.0);
		Enrollment enrollment8_3 = new Enrollment(students.get(8).getStudentID(), sections.get(3).getSectionID(), 4.0);
		Enrollment enrollment8_4 = new Enrollment(students.get(8).getStudentID(), sections.get(4).getSectionID(), 2.);
		Enrollment enrollment8_5 = new Enrollment(students.get(8).getStudentID(), sections.get(5).getSectionID(), 0.);
		Enrollment enrollment9_0 = new Enrollment(students.get(9).getStudentID(), sections.get(0).getSectionID(), 3.67);
		Enrollment enrollment9_1 = new Enrollment(students.get(9).getStudentID(), sections.get(1).getSectionID(), 4.);
		Enrollment enrollment9_2 = new Enrollment(students.get(9).getStudentID(), sections.get(2).getSectionID(), 2.67);
		Enrollment enrollment9_3 = new Enrollment(students.get(9).getStudentID(), sections.get(3).getSectionID(), 3.67);
		Enrollment enrollment9_4 = new Enrollment(students.get(9).getStudentID(), sections.get(4).getSectionID(), 4.);
		Enrollment enrollment9_5 = new Enrollment(students.get(9).getStudentID(), sections.get(5).getSectionID(), 4.);
		
		int GradePoints;
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		for(Course course: courses){
			if(course.getCourseID() == sections.get(0).getCourseID()){
				course1 = course;
			}
			else if(course.getCourseID() == sections.get(1).getCourseID()){ 
				course2 = course;
			}
			else if(course.getCourseID() == sections.get(2).getCourseID()){ 
				course3 = course;
			}
			else if(course.getCourseID() == sections.get(3).getCourseID()){ 
				course1 = course;
			}
			else if(course.getCourseID() == sections.get(4).getCourseID()){ 
				course2 = course;
			}
			else
			{
				course3  = course;
			}
		}
		//Test GPA
		//Repeat this test for each of the 10 students
		double bExpected = 3.16;
		double bActual = (enrollment0_0.getGrade() * course1.getGradePoints() +
		enrollment0_1.getGrade() * course2.getGradePoints() +
		enrollment0_2.getGrade() * course3.getGradePoints() +
		enrollment0_3.getGrade() * course1.getGradePoints() +
		enrollment0_4.getGrade() * course2.getGradePoints() +
		enrollment0_5.getGrade() * course3.getGradePoints()) / 
		(course1.getGradePoints() + course2.getGradePoints() +
		course3.getGradePoints() + course1.getGradePoints() +
		course2.getGradePoints()+ course3.getGradePoints());
		assertEquals("test GPA failed", bExpected, bActual,.01);
			
		//Test class average
		//Repeat this test for each of 6 sections
		double bExpected1 = 3.16;
		double bActual1 = (enrollment0_0.getGrade() + enrollment1_0.getGrade() +
				enrollment2_0.getGrade() + enrollment3_0.getGrade() + enrollment4_0.getGrade() +
				enrollment5_0.getGrade() + enrollment6_0.getGrade() + enrollment7_0.getGrade() +
				enrollment8_0.getGrade() + enrollment9_0.getGrade()) / 10;
		assertEquals("Test course average failed", bExpected, bActual, .01);
		
		}
	
	@Test
	public void changeMajorTest(){
		eMajor bExpected = eMajor.BUSINESS;
		//student 1 originally COMPSCI major
		students.get(1).setMajor(eMajor.BUSINESS);
		eMajor bActual = students.get(1).getMajor();
	assertEquals("changeMajorTest failed", bExpected, bActual);
	}
}