package com.TestCase;

import java.util.*;


class FlowerDemo1
{
	public void displayFlower(String continent,HashMap<String,String> m)
	{
		if(continent.equalsIgnoreCase("asia"))
		{
			System.out.println(m.get(continent));
		}
		else if(continent.equalsIgnoreCase("europe"))
		{
			System.out.println(m.get(continent));
		}
		else if(continent.equalsIgnoreCase("africa"))
		{
			System.out.println(m.get(continent));
		}	
	}	
}

public class TestContinent {

	public static void main(String[] args) 
	{
		HashMap<String,String> map= new HashMap<>();
		map.put("asia","{INDIA: LOTUS, PAKISTAN: JASMINE, NEPAL:LALI GURANS}");
		map.put("europe","{GERMANY:CORN FLOWER, FRANCE:LILY, GREECE: ACANTHUS MOLLIS}");
		map.put("africa","{EGYPT: BLUE LOTUS, NIGERIA: YELLOW TRUMPET, KENYA: ORCHID}");
		Scanner sc=new Scanner(System.in);
		FlowerDemo1 f= new FlowerDemo1();
		System.out.println("Choose a continent: ASIA, EUROPE or AFRICA");
		String continent=sc.nextLine();
		f.displayFlower(continent,map);
		sc.close();
	}

}
