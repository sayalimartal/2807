package com.factorial;

import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		Factorial factorial= new Factorial();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		
		try {
			int fact=factorial.getFactorial(number);
			System.out.println("Factorial of "+number+" is "+fact);
		} catch(InvalidInputException iie) {
			iie.printStackTrace();
		} catch(FactorialException fe) {
			fe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}