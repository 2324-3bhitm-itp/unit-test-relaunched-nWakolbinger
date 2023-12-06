package at.htl.model;

import java.util.HashMap;

public class School {
	private HashMap<Integer, Student> students = new HashMap<>();
	private HashMap<Integer, Teacher> teachers = new HashMap<>();
	private HashMap<Integer, SchoolClass> schoolClasses = new HashMap<>();

	public HashMap<Integer, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<Integer, Student> students) {
		if (students == null) {
			throw new IllegalArgumentException("Map of students cannot be null");
		}

		this.students = students;
	}

	public HashMap<Integer, Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(HashMap<Integer, Teacher> teachers) {
		if (teachers == null) {
			throw new IllegalArgumentException("Map of teachers cannot be null");
		}

		this.teachers = teachers;
	}

	public HashMap<Integer, SchoolClass> getSchoolClasses() {
		return schoolClasses;
	}

	public void setSchoolClasses(HashMap<Integer, SchoolClass> schoolClasses) {
		if (schoolClasses == null) {
			throw new IllegalArgumentException("Map of school classes cannot be null");
		}

		this.schoolClasses = schoolClasses;
	}
}
