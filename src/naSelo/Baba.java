package naSelo;

public class Baba extends Thread{
	
	TavaSMekici tava;
	@Override
	public void run() {
		while(true) {
			tava.sipiMekici();
		}
	}
	public Baba(TavaSMekici tava) {
		super();
		this.tava = tava;
	}

}
