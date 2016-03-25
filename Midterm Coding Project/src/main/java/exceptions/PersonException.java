package exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception{
	private Person Person;

	public Person getPerson() {
		return Person;
	}

	public PersonException(Person Person) {
		super();
		this.Person = Person;
	}
}
