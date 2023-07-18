package icici.loans.eduloans;

import java.util.Scanner;

public class CheckYourDataTypes 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int inData;
		char charData;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value : ");
		String strData = sc.nextLine();
		
		System.out.println("Enter the Integer Value : ");
		inData = sc.nextInt();
		
		System.out.println("Enter the Character value : ");
		charData = sc.next().charAt(0);
		
		sc.close();
		
		//show the datatypes of variables by using getclass() & getSimpleMetghod()
		System.out.println(inData+ "is a type" + ((Object)inData).getClass().getSimpleName());
		System.out.println(charData+ "is a type" +((Object)charData).getClass().getSimpleName());
		System.out.println(strData+ "is a type" +strData.getClass().getSimpleName());
	}

}
