package com.date.displaydaydate;

import java.time.LocalDate;

public class DisplayDayDate {

	public static void main(String[] args) {
		LocalDate date;
		date=LocalDate.now();
		System.out.println(date.getDayOfWeek()+", "+date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
	}
}
