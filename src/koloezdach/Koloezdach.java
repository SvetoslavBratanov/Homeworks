package koloezdach;

public class Koloezdach implements Runnable {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	long speed = 1000;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				return;
			}
			System.out.println(getName() + " izbqgah " + i*10);
		}
	}
}
