package com.inheritance;
class HumanBeing
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Employee extends HumanBeing
{
	private int id;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setName("Ankit");
		System.out.println("Name:"+e.getName());
		e.setId(10);
		System.out.println("ID:"+e.getId());
		e.setSalary(45000.50);
		System.out.println("Salary:"+e.getSalary());
	}

}
