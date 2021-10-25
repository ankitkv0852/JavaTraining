package com.inheritance;
class Restuarant
{
	public void useIngredients()
	{
		System.out.println("Parent:Ingredients used");
	}
	public void useVegetables()
	{
		System.out.println("Parent:Vegetables used");
	}
}
class Chinese extends Restuarant
{
	public void serveNoodles()
	{
		System.out.println("Chinese:noodles served");
	}
}
class Mexican extends Restuarant
{
	public void serveNachos()
	{
		System.out.println("Mexican:nachos served");
	}
}
class Italian extends Restuarant
{
	public void servePasta()
	{
		System.out.println("Italian:pasta served");
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) 
	{
		Chinese c= new Chinese();
		Mexican m= new Mexican();
		Italian i= new Italian();
		c.useIngredients();
		c.useVegetables();
		c.serveNoodles();
		m.useIngredients();
		m.useVegetables();
		m.serveNachos();
		i.useIngredients();
		i.useVegetables();
		i.servePasta();
	}

}
