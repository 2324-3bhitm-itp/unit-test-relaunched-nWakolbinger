package at.htl.model;

public class Teacher extends Person {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary < 0) {
			throw new IllegalArgumentException("Teacher has to have positive salary");
		}

		this.salary = salary;
	}
}
