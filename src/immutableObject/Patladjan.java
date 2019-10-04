package immutableObject;

public final class Patladjan {
	
	final int razmer;
	final String vkus;
	final int gramaj;
	
	@Override
	public String toString() {
		return "Patladjan [razmer=" + razmer + ", vkus=" + vkus + ", gramaj=" + gramaj + "]";
	}


	public Patladjan(int razmer, String vkus, int gramaj) {
		super();
		this.razmer = razmer;
		this.vkus = vkus;
		this.gramaj = gramaj;
	}
	
	
	public Patladjan setRazmer(int razmer) {
		return new Patladjan(razmer, this.vkus, this.gramaj);
	}
	public Patladjan setVkus(String vkus) {
		return new Patladjan(this.razmer, vkus, this.gramaj);
	}
	public Patladjan setGramaj(int gramaj) {
		return new Patladjan(this.razmer, this.vkus, gramaj);
	}
	
	

}
