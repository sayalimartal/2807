package com.date.futuredate;

import java.time.LocalDate;

public class FutureDate {
	LocalDate date;

	public FutureDate(int day,int month,int year) {
		date=LocalDate.of(year, month, day);
	}
	
	public LocalDate findFutureDate(int days) {
		LocalDate futureDate=date.plusDays(days);
		return futureDate;
	}
	

}
