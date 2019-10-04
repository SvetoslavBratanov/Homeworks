package threads_test;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		// getting current thread's data
		System.out.println(Thread.currentThread().getName());
	}
}
