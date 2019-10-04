package test;

public abstract class Animal implements Soundable {
	public static void main(String[] args) {
		Soundable dog = new Dog();
		dog.getSound();
		((Dog) dog).bestFriend();
		dog = new Cat();
		((Cat) dog).annoying();
	}
}
 