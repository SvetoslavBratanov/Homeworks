package test2;

public class Person {
	String name;
	
	public static void main(String[] args) {
		Person pesho = new Person();
		Person ginka = pesho;
		
		System.out.println(pesho==ginka);
	}
}
