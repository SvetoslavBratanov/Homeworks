package naSelo;

public class Vnuche extends Thread{
	
	TavaSMekici tava;
	
	public Vnuche(TavaSMekici tava) {
		super();
		this.tava = tava;
	}

	@Override
	public void run() {
		while(true) {
			tava.hapvaMekici();
		}
	}

}
