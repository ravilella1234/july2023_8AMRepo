package icici.loans.eduloans;

public class Employee 
{
	int eno;
	String ename;
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.eno=1744;
		e1.ename="ravi";
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		Employee e2 = new Employee();
		e2.eno=1745;
		e2.ename="sai";
		System.out.println(e2.eno);
		System.out.println(e2.ename);
	}
}
