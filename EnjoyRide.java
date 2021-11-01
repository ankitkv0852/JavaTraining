package com.TestCase;

import java.util.*;

public class EnjoyRide
{
	static int adultFare(int adult, int hour, String ride) throws Exception
	{
		int adultfare=0;
		int price=1;
		while(hour>0)
		{
			if(ride.equalsIgnoreCase("ALIBABA"))
			{
				adultfare+=adult*(50*price);
			}
			else if(ride.equalsIgnoreCase("ALPINE SLIDE"))
			{
				adultfare+=adult*(60*price);
			}
			else if(ride.equalsIgnoreCase("BUMPER CARS"))
			{
				adultfare+=adult*(45*price);
			}
			else if(ride.equalsIgnoreCase("BALOON RACE"))
			{
				adultfare+=adult*(70*price);
			}
		price++;
		hour--;
		}
		return adultfare;
	}
	static int childFare(int child, int hour, String ride) throws Exception
	{
		int childfare=0;
		int price=1;
		while(hour>0)
		{
			if(ride.equalsIgnoreCase("ALIBABA"))
			{
				childfare=childfare+(child*(40*price));
			}
			else if(ride.equalsIgnoreCase("ALPINE SLIDE"))
			{
				childfare+=child*(30*price);
			}
			else if(ride.equalsIgnoreCase("BUMPER CARS"))
			{
				childfare+=child*(25*price);
			}
			else if(ride.equalsIgnoreCase("BALOON RACE"))
			{
				childfare+=child*(60*price);
			}
		price++;
		hour--;
		}
		return childfare;
	}
	public static void main(String[] args)
		{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("How many Adults?");
			int adult=sc.nextInt();
			System.out.println("How many Children?");
			int child=sc.nextInt();
			System.out.println("Which Ride? Alibaba, Alpine Slide, Bumper Cars or Baloon Race");
			sc.nextLine();
			String ride=sc.nextLine();
			System.out.println("How many hours you want to take a ride?");
			int hour=sc.nextInt();
			int adultfare=adultFare(adult,hour,ride);
			int childfare=childFare(child,hour,ride);
			int totalfare=adultfare+childfare;
			System.out.println("Total hour of ride: "+hour);
			System.out.println("Total money collected for adult ride: "+adultfare);
			System.out.println("Total money collected for child ride: "+childfare);
			System.out.println("Total Amount: "+totalfare);
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
