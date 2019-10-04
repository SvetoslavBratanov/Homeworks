package threads;

public class MnogoPiqnStudent extends Thread{
	
	public MnogoPiqnStudent(ButilkaRakia piene) {
		super();
		this.piene = piene;
	}
	ButilkaRakia piene;
	@Override
	public void run() {
		piene.chupq();
	}

}
