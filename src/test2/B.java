package test2;

public class B extends A{
	boolean t = false;
	public B() {
		t = false;
	}
	void setTrue() {
		//t = true;
		System.out.println(this.t);
		System.out.println(super.t);
	}
	
	void sing() {
		System.out.println("Lalala");
	}
	
	void doIt(String s) {
		System.out.println("B - " + s);
	}
	 
	public static void main(String[] args) {
		B b = new B();
		//b.t=true;
		b.setTrue();
		
		A a = new B();
		((B) a).sing();
		
		B be = (B) new A();
		Integer i = new Integer(4);
		
		be.doIt(null);
		
		
	}
}
