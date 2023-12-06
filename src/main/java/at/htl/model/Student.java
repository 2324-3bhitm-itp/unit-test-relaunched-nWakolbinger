package at.htl.model;

public class Student extends Person {
	private int studentNumber;

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		if (studentNumber < 1) {
			throw new IllegalArgumentException("Student number has to be positiv");
		}
		this.studentNumber = studentNumber;
	}
}
