package icici.loans.carloans;

import java.util.Date;

public   class A 
{	
	public static final int x = 100;
	
	public void m1()
	{
		System.out.println("iam m1 from A");
		
		System.out.println(x);
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method");
	}
	
	static
	{
		System.out.println("iam static Block...");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public abstract void m6();

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();	
		A.m4();
	}

}
