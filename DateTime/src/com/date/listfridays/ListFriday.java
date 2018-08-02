package com.date.listfridays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListFriday {
	public static void main(String[] args) {
		
		final LocalDate startDate=LocalDate.of(1900, 1, 13);
		final LocalDate endDate=LocalDate.of(2000, 1, 13);
		
		Predicate<LocalDate> check= date -> date.isBefore(endDate);
		Stream.iterate(startDate, date -> date.plusMonths(1L)).filter(check).filter(date -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY)).forEach(System.out::println);
	}

}
