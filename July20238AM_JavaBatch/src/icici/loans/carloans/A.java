package icici.loans.carloans;

import icici.loans.eduloans.C;

public class A 
{	
	public void m1()
	{
		System.out.println("iam m1 from A");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		A obj;
		
		 obj = new B();
		obj.m1();
		
		 obj = new C();
		obj.m1();
	}

}
