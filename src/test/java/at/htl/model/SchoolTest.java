package at.htl.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SchoolTest {
	School school;

	@BeforeEach
	public void beforeEach() {
		school = new School();
	}

	@Test
	public void teachersSetter_getterReturnsCorrectMap() {
		HashMap<Integer, Teacher> teachers = new HashMap<>();
		teachers.put(1, new Teacher());
		school.setTeachers(teachers);
		assertEquals(teachers, school.getTeachers());
	}

	@Test
	public void teachersSetter_throwsExceptionForNull() {
		assertThrows(IllegalArgumentException.class, () -> school.setTeachers(null));
	}

	@Test
	public void studentsSetter_getterReturnsCorrectMap() {
		HashMap<Integer, Student> students = new HashMap<>();
		students.put(1, new Student());
		school.setStudents(students);
		assertEquals(students, school.getStudents());
	}

	@Test
	public void studentsSetter_throwsExceptionForNull() {
		assertThrows(IllegalArgumentException.class, () -> school.setStudents(null));
	}

	@Test
	public void schoolClassesSetter_getterReturnsCorrectMap() {
		HashMap<Integer, SchoolClass> schoolClasses = new HashMap<>();
		schoolClasses.put(1, new SchoolClass());
		school.setSchoolClasses(schoolClasses);
		assertEquals(schoolClasses, school.getSchoolClasses());
	}

	@Test
	public void schoolClassesSetter_throwsExceptionForNull() {
		assertThrows(IllegalArgumentException.class, () -> school.setSchoolClasses(null));
	}
}
