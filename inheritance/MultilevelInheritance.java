package com.inheritance;
class Engineer extends Employee
{
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		Engineer e1=new Engineer();
		e1.setName("Ankit");
		System.out.println("Name:"+e1.getName());
		e1.setId(10);
		System.out.println("ID:"+e1.getId());
		e1.setSalary(45000.50);
		System.out.println("Salary:"+e1.getSalary());
		e1.setDesignation("Java Developer");
		System.out.println("Salary:"+e1.getDesignation());
	}
	
}
