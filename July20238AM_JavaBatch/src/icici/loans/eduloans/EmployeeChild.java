package icici.loans.eduloans;

public class EmployeeChild extends Employee
{
	String city;

	public EmployeeChild(String city) 
	{
		super(1,"ravi",12.34f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
		
	public static void main(String[] args) 
	{
		EmployeeChild obj = new EmployeeChild("Hyderabad");
	}

}
