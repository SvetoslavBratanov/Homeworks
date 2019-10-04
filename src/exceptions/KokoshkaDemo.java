package exceptions;

public class KokoshkaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kokoshka[] array = {new Kokoshka("Koki"), new Kokoshka("Pesho"), new Kokoshka("Puhi"), new Kokoshka("Ginka")};
	
		Baba baba = new Baba();
		try {
			baba.hraniKokoshki(array);
		} catch (Exception e){
			System.out.println("Tyrsim kokoshkata");
		}
		
		//for unchecked exceptions it's not needed to surround with try catch or throws
		//throw new NullPointerException();
	}

}
