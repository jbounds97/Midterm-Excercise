package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import com.cisc181.eNums.*;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import exceptions.PersonException;

public class Staff_Test {

	ArrayList<Staff> my_staff = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup(){	
	} 
	
	@Before
	public void setupStaffTest(){
		
		try{
			Staff person1 = new Staff("John", "Michael", "Bounds", new Date(90, 6, 11), "5 Someplace Drive", "(555)555-5555",
					"email@email.com", "5-8pm", 5, 200000, new Date(), eTitle.MR);
			Staff person2 = new Staff("Mark", "Dude", "Redman", new Date(17, 3, 20), "8 Someplace Drive", "(555)444-5555",
					"email@google.com", "2-9pm", 4, 100000, new Date(), eTitle.MRS);
			Staff person3 = new Staff("Sarah", "Girl", "O'Connor", new Date(16, 2, 21), "8 APlace Drive", "(555)333-5555",
					"email@yahoo.com", "1-9pm", 3, 150000, new Date(), eTitle.MS);
			Staff person4 = new Staff("Bruce", "Man", "Wayne", new Date(77, 6, 30), "8 Gotham Drive", "(222)444-5555",
					"email@Batman.com", "12am-12am", 10, 1000000000, new Date(), eTitle.MR);
			Staff person5 = new Staff("Hillary", "Rodrham", "Clinton", new Date(45, 7, 11), "8 Texas Drive", "(555)444-2222",
					"email@private.com", "2-3pm", 6, 1000000, new Date(), eTitle.MRS);
			
			my_staff.add(person1);
			my_staff.add(person2);
			my_staff.add(person3);
			my_staff.add(person4);
			my_staff.add(person5);
		}
		catch(PersonException e){
			System.out.println("Error: " + e.getPerson().getFirstName() + " " + e.getPerson().getMiddleName() + " " + e.getPerson().getLastName() + ". Either the person you tried entering was over 100 years old,"
					+ " or his/her phone number was not a valid US number.");
		}
	}
	
	@Test
	public void staffSalaryTest() {
		double sum = 0;
		int denominator = 0;
		
		for(Staff person: my_staff){
			sum += person.getSalary();
			denominator += 1;
		}
		double average = sum/denominator;
		System.out.println("Test Staff Class for Salary");
		double bExpectedResult = 200290000;
		double bActualResult = average;
		assertEquals("test staffSalaryTest() failed", bExpectedResult, bActualResult,.01);	}	

	@Test(expected = PersonException.class)
	public void WrongDOBTest() throws Exception{
		System.out.println("Test DOB");
		Staff new_person1 = new Staff("John", "Michael", "Bounds", new Date(16, 1, 12), "5 Someplace Drive", "(555)555-5555",
			"email@email.com", "5-8pm", 5, 200000, new Date(), eTitle.MR);	
		}
	
	@Test(expected = PersonException.class)
	public void WrongPhoneTest() throws Exception{
		System.out.println("Test Phone Number");
		Staff new_person1 = new Staff("John", "Michael", "Bounds", new Date(44, 1, 12), "5 Someplace Drive", "(555)55-5555",
			"email@email.com", "5-8pm", 5, 200000, new Date(), eTitle.MR);	
		}
	}

