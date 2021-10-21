package ntt_training;
import java.util.*;

public class Checker {

	public static void Add(int no1, int no2)
	{
		System.out.println("Value:"+no1+no2);
	}
	public static void Avg(int no1, int no2)
	{
		System.out.println("Value:"+(no1+no2)/2);
	}
	public static void OddEven(int no1)
	{
		if(no1%2==1)
			System.out.println("It is an Odd number");
		else
			System.out.println("It is an Even number");
	}
	public static void PostNeg(int no1)
	{
		if(no1>=0)
			System.out.println("It is a Positive number");
		else
			System.out.println("It is an Negative number");
	}
	public static void Prime(int no1)
	{
		boolean flag=false;
		for(int i=2;i<(no1/2);i++)
		{
			if(no1%i == 0) 
			{
				System.out.println("It is not a Prime number");
				flag = true;
				break;
			}
		}
		if(flag == false)
			System.out.println("It is an Prime number");
	}
	public static void Quit()
	{
		System.exit(0);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean status= true;
		do
		{
			System.out.println("Enter 1 to Add two numbers\n"+"Enter 2 to find average of 2 numbers\n"
					+"Enter 3 to check even/odd\n"+"Enter 4 to check positive or negative number\n"
					+"Enter 5 to check prime no or not\n"
					+"Enter 6 Quit\n"+ "");
			int value=sc.nextInt();
			int no1,no2;
			switch(value)
			{
			case 1:	System.out.println("Enter the first number");
					no1=sc.nextInt();
					System.out.println("Enter the second number");
					no2=sc.nextInt();
					Add(no1,no2);
					break;
					
			case 2:	System.out.println("Enter the first number");
					no1=sc.nextInt();
					System.out.println("Enter the second number");
					no2=sc.nextInt();
					Avg(no1,no2);
					break;
					
			case 3:	System.out.println("Enter the number");
					no1=sc.nextInt();
					OddEven(no1);
					break;

			case 4:	System.out.println("Enter the number");
					no1=sc.nextInt();
					PostNeg(no1);
					break;

			case 5:	System.out.println("Enter the number");
					no1=sc.nextInt();
					Prime(no1);
					break;

			case 6:	status=false;
					Quit();
					break;
					
			default:System.out.println("Wrong choice entered");	
			
			}
			System.out.println("if you want to continue press 7 else type 6 to exit\n");
			int choice=sc.nextInt();
			if(choice==7)
				status=true;
		}while(status);

	}

}
