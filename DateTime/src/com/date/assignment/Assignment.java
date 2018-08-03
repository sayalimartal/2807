package com.date.assignment;

import java.time.LocalDate;

public class Assignment {
	private String assignmentName;
	private LocalDate dueDate;
			
	public Assignment(String assignmentName, LocalDate dueDate) {
		this.assignmentName = assignmentName;
		this.dueDate = dueDate;
	}

	public String getSubject() {
		return assignmentName;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	@Override
	public String toString() {
		return "Assignment [subject=" + assignmentName + "]";
	}
	
}
