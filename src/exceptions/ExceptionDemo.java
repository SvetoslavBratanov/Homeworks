package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		test();
	}

	static void test() {
		System.out.println("Before test");
		explode();
		System.out.println("After test");
	}

	private static void explode() {
		System.out.println("Before explode");
		// try {
		pushTheButton();
		// }
		// catch (ArithmeticException e) {
		// System.out.println("Ne mojesh da deli6 na nula kostur");
		// }
		System.out.println("After explode");
	}

	private static void pushTheButton() {
		System.out.println("Before push");
		try {
			// int x = 5/0;
			System.out.println("Male gledaj kak ne se printa");
			String name = null;
			name.equals("Pesho");
			System.out.println("Male gledaj kak ne se printa");
		}
		// catch (ArithmeticException | NullPointerException e) {
		// System.out.println("Ne mojesh da deli6 na nula kostur");
		// // System.out.println("Ne moga da go obrabotq - hwyrlqm na
		// // sledwa6tiq");
		// // throw e;
		// }
		// global handler exception
		catch (Exception e) {
			System.out.println("Az sym naj-golemiq hvashtach na greshki");
			throw new NullPointerException();
		} finally {

			try {
				for (int i = 0; i < 5; i++) {
					if (i == 3) {
						 int y = 5/0;
						break;
					}
				}
				 //throw new NullPointerException();
			} finally {
				System.out.println("Emi 6te si sipq vodka!");
			}

			System.out.println("Emi 6te si sipq rakiq!");

		}

		// JVM creates exception and forward it throug stackframe
		// ArithmeticException e = new ArithmeticException();

		System.out.println("After push");

	}

}
