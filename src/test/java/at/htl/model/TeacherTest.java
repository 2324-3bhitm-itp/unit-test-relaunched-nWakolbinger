package at.htl.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {
	Teacher teacher;

	@BeforeEach
	public void beforeEach() {
		teacher = new Teacher();
	}

	@Test
	public void testStudentInstanceOfPerson() {
		assertInstanceOf(Person.class, teacher);
	}

	@Test
	public void getSalary_returnsCorrectSalary() {
		teacher.setSalary(5000);
		assertEquals(5000, teacher.getSalary());
	}

	@Test
	public void setSalary_setsCorrectSalary() {
		teacher.setSalary(6000);
		assertEquals(6000, teacher.getSalary());
	}

	@Test
	public void setSalary_throwsExceptionForNegativeSalary() {
		assertThrows(IllegalArgumentException.class, () -> teacher.setSalary(-1000));
	}
}
