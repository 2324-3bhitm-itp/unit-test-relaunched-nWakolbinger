package at.htl.model;

import java.util.HashMap;

public class SchoolClass {
	private HashMap<Integer, Student> students = new HashMap<>();

	public HashMap<Integer, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<Integer, Student> students) {
		if (students == null) {
			throw new IllegalArgumentException("Map of students cannot be null");
		}

		this.students = students;
	}
}
