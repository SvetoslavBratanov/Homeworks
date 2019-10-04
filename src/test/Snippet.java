package test;


public class Snippet {

	public static void main(String[] args) {
		fun();
		

	}
	static public void fun() {
		String x = null;
		Object y = 1;
		magic(x, y);
		System.out.println(x);
	}
	
	public static void magic(Object x, Object y) {
		Object tmp = x;
		x = y;
		y = tmp;
	}


}
