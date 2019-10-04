package demoThreads;

public class Student extends Thread{
	
	public Student(ButilkaRakia piene) {
		super();
		this.piene = piene;
	}
	ButilkaRakia piene;
	@Override
	public void run() {
		
		piene.otpivam(100);
		
		
	}

}
