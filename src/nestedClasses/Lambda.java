package nestedClasses;

public abstract class Lambda implements IWelcome {


	
	
	public static void main(String[] args) {
		Lambda.hey((String s1) -> { System.out.println(s1); });
		
	}
	
	public static void hey(IWelcome i) {
		
	}

}
