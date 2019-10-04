package nestedClasses;

public class Piqnica {
	
	String nacionalnost;
	String ime;
	int age;
	int promili;
	Piene piene;
	
	public Piqnica(String nacionalnost) {
		this.nacionalnost = nacionalnost;
		piene = new Piene();
		
	}
	
	class Piene  {
		String kind;
		int promili;

		public Piene() {
			
			if (nacionalnost.equals("Rusnak")) {
				this.kind = "Vodka";
				this.promili = 50;
			}
			if (nacionalnost.equals("Qponec")) {
				this.kind = "Sake";
				this.promili = 20;
			}
			if (nacionalnost.equals("Bylgarin")) {
				this.kind = "Rakijka";
				this.promili = 70;
			}
			if (nacionalnost.equals("Francuzin")) {
				this.kind = "Cherveno Vino Merlo";
				this.promili = 14;
			}
			
		}

		@Override
		public String toString() {
			return "Piene [kind=" + kind + ", promili=" + promili + "]";
		}
		
	}

}
