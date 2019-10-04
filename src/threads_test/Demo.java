package threads_test;

class Demo extends Thread {
	public void run() {
		System.out.println("running thread with name : " + Thread.currentThread().getName());
		System.out.println("running thread with priority : " + Thread.currentThread().getPriority() + " " + Thread.currentThread().getName());
		
	}

	public static void main(String args[]) {
		Demo m1 = new Demo();
		Demo m2 = new Demo();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}
