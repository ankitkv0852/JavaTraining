package com.TestCase;

import java.util.Scanner;

public class Employee 
{
	private int employeeid;
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	private String employeename;
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	private float basicsalary;
	public void setBasicsalary(float basicsalary) {
		this.basicsalary = basicsalary;
	}	
	private float sa;
	private float hra;
	private float transportallowance;
	private final int tax=2500;
	void calculateNetSalary() throws Exception
	{
		float netsalary=0;
		if(basicsalary<=10000)
		{
			hra=basicsalary*0.2f;
			sa=basicsalary*0.8f;
			transportallowance=basicsalary*0.2f;
			netsalary=(basicsalary+hra+sa+transportallowance)-tax;
		}
		else if(basicsalary>10001 && basicsalary<=20000)
		{
			hra=basicsalary*0.25f;
			sa=basicsalary*0.9f;
			transportallowance=basicsalary*0.2f;
			netsalary=(basicsalary+hra+sa+transportallowance)-tax;
		}
		else if(basicsalary>=20001)
		{
			hra=basicsalary*0.3f;
			sa=basicsalary*0.95f;
			transportallowance=basicsalary*0.2f;
			netsalary=(basicsalary+hra+sa+transportallowance)-tax;
		}
		System.out.println("Employee Id: "+ employeeid);
		System.out.println("Employee Name: "+ employeename);
		System.out.println("Net Salary: "+ netsalary);
	}
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			Employee e=new Employee();
				System.out.println("Enter Id ");
				e.setEmployeeid(sc.nextInt());
				System.out.println("Enter the Name");
				sc.nextLine();
				e.setEmployeename(sc.nextLine());
				System.out.println("Enter the basic salary");
				e.setBasicsalary(sc.nextFloat());
				e.calculateNetSalary();
				sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
