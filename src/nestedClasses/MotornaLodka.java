package nestedClasses;

public class MotornaLodka {
	
	int dyljinaPerkata;
	String model;
	
	static class Engine extends Traktor.Engine {
		
		public Engine() {
			super.broiButala = 45;
			super.x = 102;
		}
		
	}

}
