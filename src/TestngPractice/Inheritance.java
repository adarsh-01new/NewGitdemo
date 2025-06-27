package TestngPractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inheritance extends demo {

	/*
	 * @Test public void nw() { callname(); System.out.println(a);
	 * 
	 * }
	 */
	int b = 15;

	@Test
	public void coninstru() {
		Demo2 d = new Demo2(b);
		System.out.println(d.increment());
		System.out.println(d.decrement());
		System.out.println(d.multiple());
	}

}
