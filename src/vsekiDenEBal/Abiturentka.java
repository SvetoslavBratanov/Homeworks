package vsekiDenEBal;

import java.util.concurrent.atomic.AtomicInteger;

public class Abiturentka extends Thread {

//	static AtomicInteger counter = new AtomicInteger(0);
	static Integer counter = new Integer(0);

	@Override
	public void run() {

//		if (counter.get() == 0) {
//			System.out.println("I koj kaza...");
//		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
		synchronized (counter) {
			counter++;
			System.out.println("Vikam i si piq: " + counter);
		}
		
//		if(counter>12) {
//			System.out.println("Are chao! Napih se!");
//		}

	}
}
