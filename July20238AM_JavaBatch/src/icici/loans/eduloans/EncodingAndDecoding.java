package icici.loans.eduloans;

import java.util.Base64;

public class EncodingAndDecoding 
{

	public static void main(String[] args) 
	{
		String password = "test1234";
		System.out.println("Password is : " +  password);
		
		byte[] encodedString = password.getBytes();
		System.out.println("Encoded string : " + encodedString);
		
		byte[] decodeString = Base64.Dec
		System.out.println("Decoded String : " + decodeString);
	}

}
