package com.employee.controller;

import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.service.EmployeeService;

public interface Controller {
	void addEmployee(Employee employee);
	TreeSet<Employee> viewAllEmployee();
	Employee getEmpById(int id);
	void deleteEmp(int id);
	public void setService(EmployeeService employeeService);

}
