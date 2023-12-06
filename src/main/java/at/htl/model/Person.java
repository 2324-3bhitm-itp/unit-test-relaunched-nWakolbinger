package at.htl.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		if (address == null) {
			throw new IllegalArgumentException("Address can not be null");
		}

		if (address.getCity() == null || address.getHouseNumber() == null || address.getStreet() == null) {
			throw new IllegalArgumentException("Invalid Address provided");
		}

		this.address = address;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		if (dateOfBirth == null) {
			throw new IllegalArgumentException("Birthdate can not be null");
		}
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirthString) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dateOfBirth = format.parse(dateOfBirthString);
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid Date provided", e);
		}
	}
}
