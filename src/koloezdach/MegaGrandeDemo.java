package koloezdach;

public class MegaGrandeDemo extends Thread{

	volatile boolean keepRunning = true;
	volatile String s = null;
	
	@Override
	public void run() {
		while (keepRunning) {
			//Thread.interrupted();
		}
		System.out.println("Umrqh!");
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		MegaGrandeDemo t = new MegaGrandeDemo();
		t.start();
		Thread.sleep(1000);
		t.keepRunning = false;
		System.out.println("t1 keep running false");
		
		MegaGrandeDemo t2 = new MegaGrandeDemo();
		t2.start();
		Thread.sleep(1000);
		t2.keepRunning = false;
		System.out.println("t2 keep running false");
		
		t.s = "hey";
		Thread.interrupted();
		MegaGrandeDemo t3 = new MegaGrandeDemo();
		t3.start();
		Thread.sleep(1000);
		t3.keepRunning = false;
		
		System.out.println("t3 keep running false");

	}

}
