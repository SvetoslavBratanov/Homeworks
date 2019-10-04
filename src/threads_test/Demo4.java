package threads_test;

public class Demo4 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Demo4 t1 = new Demo4();// creating thread
		Demo4 t2 = new Demo4();
		Demo4 t3 = new Demo4();
		t1.setDaemon(true);// now t1 is daemon thread
		t1.start();// starting threads
		t2.start();
		t3.start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous");
			}
			
		}).start();
		
		new Thread (() -> System.out.println("Lambda!")).start();
		
		MyRunnable runnable = new MyRunnable();

		Thread t4 = new Thread(runnable, "Thread 4");
		Thread t5 = new Thread(runnable, "Thread 5");

		t4.start();
		t5.start();
		//Thread.sleep(2700);
	
	}
}
