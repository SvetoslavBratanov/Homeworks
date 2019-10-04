package test;

public interface IPlay {
	default public void information() {
		System.out.println("IPlay");
	}
	public void opa();
}
