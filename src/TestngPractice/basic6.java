package TestngPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basic6 {
	@Test(groups = { "smoke" })
	public void aarneww() {
		System.out.println("starting with car");
	}

	@Test(dependsOnMethods= {"yarneww2"})
	public void tarneww1() {
		System.out.println("car is one");
	}

	@Test
	public void yarneww2() {
		System.out.println("car is tow");
	}

	/*
	 * @BeforeMethod public void Carneww3() {
	 * System.out.println("before every method in basic6"); }
	 * 
	 * @AfterMethod public void Carnew4() {
	 * System.out.println("after every method in basic6"); }
	 */

}
