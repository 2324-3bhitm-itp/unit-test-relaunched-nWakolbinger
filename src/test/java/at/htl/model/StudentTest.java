package at.htl.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
	Student student;

	@BeforeEach
	public void beforeEach() {
		student = new Student();
	}

	@Test
	public void testStudentInstanceOfPerson() {
		assertInstanceOf(Person.class, student);
	}

	@Test
	public void studentNumberSetter_getterReturnsCorrectNumber() {
		student.setStudentNumber(12345);
		assertEquals(12345, student.getStudentNumber());
	}

	@Test
	public void studentNumberSetter_throwsExceptionForNegativeNumber() {
		assertThrows(IllegalArgumentException.class, () -> student.setStudentNumber(-12345));
	}

	@Test
	public void studentNumberSetter_throwsExceptionForZero() {
		assertThrows(IllegalArgumentException.class, () -> student.setStudentNumber(0));
	}
}
