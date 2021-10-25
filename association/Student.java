package com.association;

public class Student 
{
	private String name;
	private int rollno;
	private String city;
	public void getName() {
		System.out.println("Name:"+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getRollno() {
		System.out.println("Roll no:"+rollno);
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void getCity() {
		System.out.println("City:"+city);
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void getStudentBranch()
	{
		Branch b=new Branch();
		b.studiesBranch();
	}
	public void getCollegeSociety()
	{
		Society s=new Society();
		s.collegeSociety();
	}

}
