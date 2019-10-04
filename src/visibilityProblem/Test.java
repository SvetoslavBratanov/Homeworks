package visibilityProblem;

public class Test extends Thread{

	volatile boolean keepRunning = true;
	boolean keepRunningSecond = true;
	
	@Override
	public void run() {
		while(keepRunning) {
			//System.out.println("while");
		}
		System.out.println("Thread is terminagted");
		while(keepRunningSecond) {
			//System.out.println("while");
		}
		System.out.println("Thread is terminagted from second");
	}
	public static void main(String[] args) throws InterruptedException {
		
		Test t = new Test();
		t.start();
		Thread.sleep(1000);
		t.keepRunningSecond = false;
		System.out.println("keeprunning SECOND is false");
		Thread.sleep(1000);
		t.keepRunning = false;
		System.out.println("keeprunning is false");
		
		

	}

}
