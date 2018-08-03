package com.date.futuredatetest;

import java.time.LocalDate;
import java.util.Scanner;

import com.date.futuredate.FutureDate;

public class FutureDateTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the date in (dd/mm/yyyy) format: ");
		String dateStr=scanner.nextLine();
		
		String[] date= dateStr.split("/");
		FutureDate futureDate= new FutureDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
		System.out.print("Entered Date: "+dateStr);
		
		System.out.println("Enter number of days after which future date is to be found: ");
		int days=scanner.nextInt();
		
		LocalDate newDate= futureDate.findFutureDate(days);
		System.out.println("Future date: "+newDate.getDayOfMonth()+"/"+newDate.getMonth()+"/"+newDate.getYear());
	}

}
