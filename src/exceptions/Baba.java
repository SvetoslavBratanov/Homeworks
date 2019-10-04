package exceptions;


public class Baba {

	void hraniKokoshki(Kokoshka[] k) throws BabaSeVajkaException{

		for (Kokoshka koki : k) {
			try {
				koki.kylveZyrno();
			} catch (KokoshkaUmrqException e) {
				throw new BabaSeVajkaException("Majko mila", e);
			} catch (KokoshkaDaIzbqgaException e) {
				throw new BabaSeVajkaException("Majko mila", e);
			}

		}
	}

}
