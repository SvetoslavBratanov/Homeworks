package koloezdach;

public class DemoKoloezdene {

	private static final int KOLOEZDACHI = 20;

	public static void main(String[] args) {
		ThreadGroup groupataNaNazobenite = new ThreadGroup("Zob do grob!");
		
		for (int i = 1; i <= KOLOEZDACHI; i++) {
			Koloezdach k = null;
			if (Math.random() > 0.4 ) {
				k = new NazobenKoloezdach();
				k.setName("Nazoben " + i);
				new Thread(groupataNaNazobenite,k).start();
			} else {
				k = new Koloezdach();
				k.setName("Ezdach " + i);
				new Thread(k).start();
			}
			
			
		}
		Vodonoska v = new Vodonoska(groupataNaNazobenite);
		Thread vodonoska = new Thread (v);
		vodonoska.setDaemon(true);
		vodonoska.start();

	}

}
