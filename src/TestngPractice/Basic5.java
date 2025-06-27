package TestngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic5 {

	@Test(enabled=false)
	public void bikeLoan()
	{
		System.out.println("false report");
	}
	@Parameters({"bikeloanurl"})
	@Test(groups= {"smoke"})
	public void bikeLoantenure(String bikerul)
	{
		System.out.println("4years");
		System.out.println(bikerul);
	}
	/*
	 * @Test public void bike
	 */
}
