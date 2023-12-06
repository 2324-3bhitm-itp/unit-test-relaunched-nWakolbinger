package at.htl.model;


public class Address {
	private int zipCode;
	private String city;
	private String street;
	private String houseNumber;

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		if (zipCode < 1) {
			throw new IllegalArgumentException("Zip code has to be positiv");
		}

		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
}
