package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eTitle;
import exceptions.PersonException;

public class Staff extends Employee {

	 private eTitle Title;

	   public Staff(eTitle title){
	        this.Title = title;
	    }

	    public void setTitle(eTitle title){
	        this.Title = title;
	    }
	    public eTitle getTitle(){
	        return this.Title;
	    }

    

    /**
     * 
     * @param FirstName
     * @param MiddleName
     * @param LastName
     * @param DOB - Date
     * @param Address
     * @param Phone_number - (xxx)xxx-xxxx
     * @param Email
     * @param officeHours
     * @param rank - int
     * @param salary - double
     * @param hireDate - Date
     * @param Title - eTitle
     * @throws PersonException
     */
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle Title) throws PersonException
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}