package test;

public abstract class Opa {
	int number;
	Opa() {
		printNumber();
	}
	public abstract void getNumber();
	private void printNumber() {
		System.out.println(this.number);
	}
}
