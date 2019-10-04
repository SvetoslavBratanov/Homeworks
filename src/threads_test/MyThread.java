package threads_test;

public class MyThread extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("Done in another thread with extends Thread");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
		thread.start();

		MySecondThread t = new MySecondThread();
		Thread thread2 = new Thread(t);
		thread2.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class");
			}
		}).start();

		new Thread(() -> System.out.println("Lambda expression")).start();

		for (int i = 1; i <= 10; i++) {
			//Threa    d.sleep(200);
			System.out.println("Counting... " + i);
		}
		
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "Thread 1");
		Thread t2 = new Thread(runnable, "Thread 2");
		Thread t3 = new Thread(runnable, "Thread 3");
		Thread t4 = new Thread(runnable, "Thread 4");
		Thread t5 = new Thread(runnable, "Thread 5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		//Thread.sleep(2700);
		//t1.interrupt();
		
		t1.join();
		t2.join();
		t3.join();
		//t4.join();
		//t5.join();
		
		//System.out.println("All threads are dead!");

	}

}
