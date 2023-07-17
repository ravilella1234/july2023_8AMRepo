package icici.loans.eduloans;

public class VariableTypes 
{
	//primitive variable
	int eno = 100; // primitive instance variable (or) primitive global
	static String cname = "vmware"; // primitive static variable (or) static global
	static VariableTypes obj = new VariableTypes();
	
	public void m1()
	{
		int x = 200; // pimitive local variable
		int eno = 300;
		System.out.println(x);
		System.out.println(eno);
		System.out.println(this.eno);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.eno);
		System.out.println(VariableTypes.cname);
	}
	
	public static void main(String[] args) 
	{
		 obj = new VariableTypes();// non-primitive (or) reference variable
		System.out.println(obj.eno);
		System.out.println(VariableTypes.cname);
	}

}
