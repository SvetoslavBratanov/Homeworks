package nestedClasses;

public class Traktor {
	
	int kolela;
	String model;
	Engine engine;
	static int x = 5;
	static String traktorist = "Baj Gancho";
	
	static class Engine {
		int broiButala = 5;
		double razmer;
		String kind;
		static int x = 2;
		
		public Engine() {
			x++;
			System.out.println(x);
			System.out.println(traktorist);
		}
	}
	
	

}
