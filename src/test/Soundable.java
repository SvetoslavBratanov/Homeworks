package test;

public interface Soundable {
	default void sound() {
		System.out.println("Animal sound");
	}
	public void getSound();
}
