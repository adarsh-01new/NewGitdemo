package TestngPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestdThree {
	@Test(groups= {"sanity"})
	public void Creditcard() {
		System.out.println("credit card");
	}

	@BeforeMethod
	public void Debitcard() {
		System.out.println("debit card");
	}

	@BeforeClass
	public void Fuelcard() {
		System.out.println("fuelcard");
	}
	@AfterClass
	public void af()
	{
		System.out.println("after class restthree");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("after method restthree");
	}
	@BeforeTest
	public void bt() {
		
	System.out.println("before test1");
	}
	@Test
	public void failuretest()
	{
		Assert.assertTrue(false);
	}
	
}
