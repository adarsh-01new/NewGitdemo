package TestngPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basic2 {
	@Test
	public void LoanTenure() {
		System.out.println("2years");
	}

	@BeforeSuite
	public void zfsuite() {
		System.out.println("i will execute before suite");
	}
	@Test
	public void dummy()
	{
		System.out.println("dymmy");
		Assert.assertTrue(false);
	}
	@BeforeClass
	public void bfclass()
	{
		System.out.println("before class-basic2");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("after class-basic2");
	}
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("before method-basic2");
	}
}
