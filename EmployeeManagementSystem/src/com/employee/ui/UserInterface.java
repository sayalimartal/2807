package com.employee.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.bean.Employee;
import com.employee.controller.ApplicationController;

public class UserInterface {
	
	ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
	ApplicationController appController = (ApplicationController) context.getBean("Appcontroller");
	
	Scanner scanner = new Scanner(System.in);
	Map<String,Object> empDetail = new HashMap<>();
	
	public void start() {
		int flag;
		do {
			flag = showMenu();
		}while(flag==1);
	}
	
	public int showMenu() {
		
		System.out.println("Make choice:");
		System.out.println("1.Accept data");
		System.out.println("2.Get employee details by employee id");
		System.out.println("3.Display  data");
		System.out.println("4.Exit");
		
		int flag = acceptChoice();
		return flag;
	}
	
	private int acceptChoice() {
		int choice= scanner.nextInt();
		int flag=1;
		
		switch(choice) {
		case 1: acceptData();
				break;
		case 2: getEmpById();
				break;	
		case 3: displayData();
				break;
		case 4: flag=0;
				System.out.println("Exiting the user interface..");
				break;		
		}
		return flag;
	}
	
	private void getEmpById() {
		
		System.out.println("Enter employee id");
		int empId = scanner.nextInt();
		Employee employee= appController.getEmpById(empId);
		System.out.println(employee);
		
	}

	public void acceptData() {
		
		System.out.println("Enter employee name:");
		String empName=scanner.next();
		empDetail.put("employeeName",empName);
		
		System.out.println("Enter employee salary");
		long salary=scanner.nextLong();
		empDetail.put("employeeSalary",salary);	
		
		System.out.println("Enter employee designation");
		String designation=scanner.next();
		empDetail.put("employeeDesignation",designation);	
		
		appController.addEmployee(empDetail);
	
	}
	
	public void displayData() {
		
		TreeSet<Employee> set=appController.viewAllEmployee();
		set.stream().forEach(System.out::println);
		
	}

	public void setApplicationController(ApplicationController applicationController) {
		this.appController=applicationController;
		
	}
}
