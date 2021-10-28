package com.arraylist;

import java.util.*;

class MyFunction1
{
	double arraySum(ArrayList<Double> arr) 
	{
		double sum=0;
		for(int i=0;i<arr.size();i++)
		{
			sum = sum + arr.get(i);
		}
		return sum;
	}
	double arrayMean(ArrayList<Double> arr)
	{
		double mean=0;
		for(int i=0;i<arr.size();i++)
		{
			mean = mean + arr.get(i);
		}
		mean = mean/arr.size();
		return mean;
	}
	double arrayMedian(ArrayList<Double> arr)
	{
		double median=0;
		Collections.sort(arr);
		if(arr.size()%2==1)
		{
			median=arr.get(((arr.size()+1)/2)-1);
		}
		else
		{
			System.out.println(arr);
			median=(arr.get((arr.size()/2)-1)+arr.get(arr.size()/2))/2;
		}
		return median;
	}
}

public class MeanMedian {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Double> arr=new ArrayList<>();
		System.out.println("Enter the numbers of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements to add");
		for(int i=0;i<n;i++)
			arr.add(sc.nextDouble());
		MyFunction1 m=new MyFunction1();
		System.out.println("Sum of the Array is: "+m.arraySum(arr));
		System.out.println("Mean of the Array is: "+m.arrayMean(arr));
		System.out.println("Median of the Array is: "+m.arrayMedian(arr));
		sc.close();
	}

}
