package icici.loans.carloans;

public class ICICI implements Rbi
{

	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withrawl in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in ICICI");
	}

}
