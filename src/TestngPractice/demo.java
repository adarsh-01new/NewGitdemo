package TestngPractice;

import org.testng.annotations.BeforeMethod;

public class demo {

	int z = 5;

	public void callname() {

		System.out.println("my name is badsha");
	}

	@BeforeMethod
	public void bf() {
		System.out.println("number one");
	}

	/*
	 * public int increment() { z = z + 1; return z; }
	 */

}
