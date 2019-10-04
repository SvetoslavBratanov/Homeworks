package naSelo;

public class Demo {
	
	public static void main(String[] args) {
		TavaSMekici tava = new TavaSMekici();
		Baba baba = new Baba(tava);
		Vnuche vnuche = new Vnuche(tava);
		baba.start();
		vnuche.start();
	}

}
