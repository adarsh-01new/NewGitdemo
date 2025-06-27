package TestngPractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RestdyTwo {
	@BeforeClass
	public void yellow() {
		System.out.println("Yellow");
	}
	@Test(timeOut=4000)
	public void blue()
	{
		System.out.println("blue");
	}
	@Test(groups= {"sanity"})
	public void red() {
		System.out.println("red");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("before suite");
	}
	
	@Parameters("URL")
	@Test
	public void greeen(String url) {
		
		System.out.println("green");
		System.out.println(url);
	}
	
		
		@Test(dataProvider="getData")
		public void asercheck(String username,String password)
		{
			System.out.println(username);
			System.out.println(password);
		}
		
	@DataProvider
	public Object getData()
	{
		Object[][] arr=new Object[3][2];
		arr[0][0]= "firstusername";
		arr[0][1]="firstpassword";
		arr[1][0]="secondusrename";
		arr[1][1]="secondpassword";
		arr[2][0]="thirdusername";
		arr[2][1]="thirdpassword";
		return arr;
	}
	
	

}
