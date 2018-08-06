package com.employee.bean;

public class Employee implements Comparable<Employee> {
	
	private final int empId;
	private String employeeName;
	private long salary;
	private String designation;
	private static int id=10;

	public Employee(String employeeName, long salary, String designation) {
		this.empId = id++;
		this.employeeName = employeeName;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public long getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}

	@Override
	public int compareTo(Employee employee) {
		return this.empId-employee.empId;
	}

}
