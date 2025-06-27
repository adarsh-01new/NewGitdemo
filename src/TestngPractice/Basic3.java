package TestngPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic3 {

	@Test(dataProvider= "getData")
	public void CarLoan(String username,String password) {
		System.out.println("CarLoan");
		System.out.println(username);
		System.out.println(password);
		
	}

	@Test(groups = { "smoke" })
	public void Cartenure() {
		System.out.println("8Years");
	}

	@AfterSuite
	public void afsuite() {
		System.out.println("I will execute after suite");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "firstusername";
		obj[0][1] = "firstpassword";
		obj[1][0] = "secondusername";
		obj[1][1] = "secondpassowrd";
		obj[2][0] = "thirdusername";
		obj[2][1] = "thirdpassword";
		return obj;

	}
}
