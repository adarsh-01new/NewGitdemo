package TestngPractice;

public class Demo2 extends Demo3 {
	int b;

	public Demo2(int b) {
		super(b);
		this.b = b;
	}

	public int increment() {
		b = b + 2;
		return b;
	}

	public int decrement() {
		b = b - 2;
		return b;
	}

}
