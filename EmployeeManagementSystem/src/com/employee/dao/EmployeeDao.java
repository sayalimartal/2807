package com.employee.dao;

import java.util.Set;
import java.util.TreeSet;

import com.employee.bean.Employee;

public class EmployeeDao {
	Set<Employee> employeeSet=new TreeSet<>();
	
	public void addEmployee(Employee employee) {
		employeeSet.add(employee);
	}
	
	public TreeSet<Employee> viewAllEmployee() {
		return (TreeSet<Employee>) employeeSet;
	}

	public Employee getEmpById(int empId) {
		Employee emp = null;
		for(Employee employee:employeeSet) {
			if(employee.getEmpId()==empId) {
				emp = employee;
			}	
		}
		return emp;	
	}
	
	public void deleteEmp(int empId) {
		for(Employee employee:employeeSet) {
			if(employee.getEmpId()==empId) {
				 employeeSet.remove(employee);
			}	
		}
	}
}
