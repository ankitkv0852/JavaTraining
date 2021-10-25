package com.association;

public class UnderGradStudent extends Student
{
	private int year;

	public void getYear() {
		System.out.println("Student is in year "+year);
	}

	public void setYear(int year) {
		this.year = year;
	}
}
