package immutableObject;

public class DemoPatladjan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patladjan pesho = new Patladjan(30, "mnogo vkusen", 10);
		
		pesho = pesho.setGramaj(20);
		
		System.out.println(pesho);
	}

}
