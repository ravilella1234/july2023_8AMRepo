package icici.loans.eduloans;

import java.util.Scanner;

public class Debugging 
{

	public int m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum = 0;
		
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+ a[i]);
			sum = sum+a[i];
		}
		System.out.println("Sum of the array is : " +  sum);
		return sum;
	}
	
	public static void main(String[] args) 
	{		
		Debugging obj = new Debugging();
		int count = obj.m1();
		System.out.println("Count of array is : " +  count);
	}
}
