package com.TestCase;

import java.util.Scanner;

class FlowerDemo
{
	public void displayFlower(String continent)
	{
		if(continent.equalsIgnoreCase("asia"))
		{
			System.out.println("COUNTRY: INDIA\t"+"NATIONAL FLOWER: LOTUS");
			System.out.println("COUNTRY: PAKISTAN\t"+"NATIONAL FLOWER: JASMINE");
			System.out.println("COUNTRY: NEPAL\t"+"NATIONAL FLOWER: LAU GURANS");
		}
		else if(continent.equalsIgnoreCase("europe"))
		{
			System.out.println("COUNTRY: GERMANY\t"+"NATIONAL FLOWER: CORN FLOWER");
			System.out.println("COUNTRY: FRANCE\t"+"NATIONAL FLOWER: LILY");
			System.out.println("COUNTRY: GREECE\t"+"NATIONAL FLOWER: ACANTHUS MOLLIS");
		}
		else if(continent.equalsIgnoreCase("africa"))
		{
			System.out.println("COUNTRY: EGYPT\t"+"NATIONAL FLOWER: BLUE LOTUS");
			System.out.println("COUNTRY: NIGERIA\t"+"NATIONAL FLOWER: YELLOW TRUMPET");
			System.out.println("COUNTRY: KENYA\t"+"NATIONAL FLOWER: ORCHID");
		}	
	}	
}

public class Test1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		FlowerDemo f= new FlowerDemo();
		System.out.println("Choose a continent: ASIA, EUROPE or AFRICA");
		String continent=sc.nextLine();
		f.displayFlower(continent);
		sc.close();
	}
}
