package library;

public class Demo {

	public static void main(String[] args) {
		
		Book book = new Book();
		for (int i = 0; i<1000; i++) {
			Zubar z = new Zubar("zubyr"+i, book);
			z.start();
		}

	}

}
