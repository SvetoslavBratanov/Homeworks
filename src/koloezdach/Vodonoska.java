package koloezdach;

public class Vodonoska implements Runnable {
	ThreadGroup nazobeniGrupa;
	public Vodonoska(ThreadGroup nazobeniGrupa) {
		super();
		this.nazobeniGrupa = nazobeniGrupa;
	}
	@Override
	public void run() {
		while (true) {
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				return;
			}
			
			if (nazobeniGrupa.activeCount() > 0) {
				System.err.println("Na ti tazi voda");
			} else {
				System.err.println("Iskah da dam ama nqmah jelanie");
			}
			
//			Koloezdach mutant = new Koloezdach();
//			//mutant.setDaemon(false);
//			mutant.setName("MUTANT");
//			Thread t1 = new Thread(mutant);
//			t1.start();
//			System.err.println(t1.isDaemon());
		}
	}

}
