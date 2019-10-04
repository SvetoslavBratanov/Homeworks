package test;

public interface IBiju {

	default public void information() {
		System.out.println("IBiju");
	}
	
	public static void anotherInfo() {
		System.out.println("Another info");
	}
	
	public void opa();
}
