package at.htl.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {
	Address address;

	@BeforeEach
	public void beforeEach() {
		address = new Address();
	}

	@Test
	public void zipCodeSetter_getterReturnsCorrectZipCode() {
		address.setZipCode(12345);
		assertEquals(12345, address.getZipCode());
	}

	@Test
	public void zipCodeSetter_throwsExceptionForZero() {
		assertThrows(IllegalArgumentException.class, () -> address.setZipCode(0));
	}

	@Test
	public void zipCodeSetter_throwsExceptionForNegativeNumber() {
		assertThrows(IllegalArgumentException.class, () -> address.setZipCode(-12345));
	}

	@Test
	public void cityIsSetCorrectlyWhenValidCityIsProvided() {
		String validCity = "New York";
		address.setCity(validCity);
		assertEquals(validCity, address.getCity());
	}

	@Test
	public void streetIsSetCorrectlyWhenValidStreetIsProvided() {
		String validStreet = "Main Street";
		address.setStreet(validStreet);
		assertEquals(validStreet, address.getStreet());
	}

	@Test
	public void houseNumberIsSetCorrectlyWhenValidNumberIsProvided() {
		String validHouseNumber = "123A";
		address.setHouseNumber(validHouseNumber);
		assertEquals(validHouseNumber, address.getHouseNumber());
	}

	@Test
	public void cityRemainsNullWhenNullIsProvided() {
		address.setCity(null);
		assertNull(address.getCity());
	}

	@Test
	public void streetRemainsNullWhenNullIsProvided() {
		address.setStreet(null);
		assertNull(address.getStreet());
	}

	@Test
	public void houseNumberRemainsNullWhenNullIsProvided() {
		address.setHouseNumber(null);
		assertNull(address.getHouseNumber());
	}
}
