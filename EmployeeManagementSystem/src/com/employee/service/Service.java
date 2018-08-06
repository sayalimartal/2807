package com.employee.service;

import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;

public interface Service {
	
	void addEmployee(Employee employee);
	TreeSet<Employee> viewAllEmployee();
	Employee getEmpById(int id);
	void deleteEmp(int id);
	public void setDao(EmployeeDao employeeDao);
	
}
