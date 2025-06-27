package TestngPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestng {

	@AfterTest
	public void Personalinfo()
	{
		System.out.println("i will execute after test");
	}
	@BeforeTest
	public void LoanNeeded()
	{
		System.out.println("I will execute before test");
	}

}
