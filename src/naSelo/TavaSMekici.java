package naSelo;

public class TavaSMekici {
	static final int MAX_MEKICI = 100;
	static final int MIN_MEKICI = 10;
	
	int mekici = 50;
	
	synchronized public void sipiMekici() {
		if ( mekici >= MAX_MEKICI ) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("ops");
			}
		}
		notifyAll();
		mekici +=10;
		System.out.println("Babata napravi :" + mekici);
	}

	synchronized public void hapvaMekici() {
		if ( mekici <= MIN_MEKICI ) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("ops");
			}
		}
		notify();
		mekici -=10;
		System.out.println("Vnucheto izlapa 10 mekici, ostanaha :" + mekici);
	}
}
