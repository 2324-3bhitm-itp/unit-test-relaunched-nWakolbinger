package at.htl.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolClassTest {
	SchoolClass schoolClass;

	@BeforeEach
	public void beforeEach() {
		schoolClass = new SchoolClass();
	}

	@Test
	public void studentsSetter_getterReturnsCorrectMap() {
		HashMap<Integer, Student> students = new HashMap<>();
		students.put(1, new Student());
		schoolClass.setStudents(students);
		assertEquals(students, schoolClass.getStudents());
	}

	@Test
	public void studentsSetter_acceptsEmptyMap() {
		HashMap<Integer, Student> students = new HashMap<>();
		schoolClass.setStudents(students);
		assertTrue(schoolClass.getStudents().isEmpty());
	}

	@Test
	public void studentsSetter_throwsExceptionForNull() {
		assertThrows(IllegalArgumentException.class, () -> schoolClass.setStudents(null));
	}
}
