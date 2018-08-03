package com.employee.service;

import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;

public class EmployeeService implements Service {
	EmployeeDao dao;
	
	@Override
	public void addEmployee(Employee employee) {
		dao.addEmployee(employee);
	}
	
	@Override
	public TreeSet<Employee> viewAllEmployee() {
		TreeSet<Employee> employee=dao.viewAllEmployee();
		return employee;
	}
	
	@Override
	public Employee getEmpById(int id) {
		Employee employee=dao.getEmpById(id);
		return employee;
	}
	@Override
	public void deleteEmp(int id) {
		dao.deleteEmp(id);
	}
	@Override
	public void setDao(EmployeeDao employeeDao) {
		this.dao=employeeDao;
	}

}
