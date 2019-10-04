package threads;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ButilkaRakia rakia = new ButilkaRakia();
		
		for ( int i = 1; i<=20; i++) {
			Student s = new Student(rakia);
			s.start();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for ( int i = 1; i<=20; i++) {
			MnogoPiqnStudent s = new MnogoPiqnStudent(rakia);
			s.start();
		}

	}

}
