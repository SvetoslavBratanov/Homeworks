package test2;

public class A {
	boolean t = false;
	public A() {
		
	}
	public void doIt(Object o) {
		if(o != null) {
			System.out.println(o.toString());
		}
		System.out.println("A - " + o);
	}
	
	
}
