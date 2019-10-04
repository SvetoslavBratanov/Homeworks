package exceptions;

public class Kokoshka {
	
	String name;
	
	public Kokoshka(String name) {
		super();
		this.name = name;
	}

	void kylveZyrno() throws KokoshkaUmrqException, KokoshkaDaIzbqgaException {
		//da umre dokato si kylve zyrnoto da umre
		if ( Math.random() > 0.7) {
			throw new KokoshkaUmrqException(name + " Kokoshkata se gytna");
		}
		
		if ( Math.random() > 0.5) {
			throw new KokoshkaDaIzbqgaException(name + " Em izbqgah");
		}
		
		System.out.println(name + " Hem hapnah hem pospah");
	}
	
	
	

}
