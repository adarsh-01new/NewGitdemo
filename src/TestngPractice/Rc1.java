package TestngPractice;

import org.testng.annotations.Test;

public class Rc1 extends Rc2 {
	public Rc1(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	int a = 10;
	
	@Test
	public void dothis()
	{
		Rc2 rr=new Rc2(3);
		System.out.println(a);
	}

}
