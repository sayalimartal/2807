package com.employee.controller;

import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.service.EmployeeService;

public class ApplicationController implements Controller{
	EmployeeService service;
	
	@Override
	public void addEmployee(Employee employee) {
		service.addEmployee(employee);
	}

	@Override
	public TreeSet<Employee> viewAllEmployee() {
		TreeSet<Employee> employee=service.viewAllEmployee();
		return employee;
	}

	@Override
	public Employee getEmpById(int id) {
		Employee employee=service.getEmpById(id);
		return employee;
	}

	@Override
	public void deleteEmp(int id) {
		service.deleteEmp(id);
		
	}

	@Override
	public void setService(EmployeeService employeeService) {
		this.service=employeeService;
		
	}
	
}
