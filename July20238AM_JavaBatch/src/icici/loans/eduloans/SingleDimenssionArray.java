package icici.loans.eduloans;

import java.util.Scanner;

public class SingleDimenssionArray 
{

	public static void main(String[] args) 
	{
		/*int[] a = {10,20,30,40};
		
		//System.out.println(a[3]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
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
	}
}
