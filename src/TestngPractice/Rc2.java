package TestngPractice;

import org.testng.annotations.BeforeTest;

public class Rc2 {
	int a;
	
	public Rc2(int a) {
		this.a=a;
	}

	public int increment()
	{
		 a = a+1;
		 return a;
	}

}
