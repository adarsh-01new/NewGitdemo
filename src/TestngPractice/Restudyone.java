package TestngPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Restudyone {

	@Parameters("URL")
	@Test
	public void vehicleloan(String url) {
		System.out.println("vehicleloan");
		System.out.println(url);
	}

	@Test(dependsOnMethods = { "vehicleloan", "busloan" })
	public void carloan() {
		System.out.println("carloan");
	}

	@Test(groups = { "sanity" })
	public void busloan() {
		System.out.println("busloan");
	}

	@AfterTest
	public void AF() {
		System.out.println("after test1");
	}

	@Test(enabled = true)
	public void dummy() {
		System.out.println("dummy");
	}

	@AfterSuite
	public void AS() {
		System.out.println("after suite");
	}
}