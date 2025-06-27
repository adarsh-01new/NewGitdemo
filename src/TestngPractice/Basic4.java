package TestngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic4 {
	
	@Parameters({"URL"})
	@Test
	public void weblogin(String urlval)
	{
		System.out.println("weblogin");
		System.out.println(urlval);
	}
	@Test(timeOut=4000)
	public void mobilelogin()
	{
		System.out.println("mobilelogin");
	}
	@Parameters({"apitoken","URL"})
	@Test
	public void apilogin(String token,String url)
	{
		System.out.println("apilogin");
		System.out.println(token);
		System.out.println(url);
	}
	
}
