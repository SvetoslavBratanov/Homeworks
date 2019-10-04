package nestedClasses;

public class Outer {

	private String value;
	private static int count;
	
	void accessMemberFromTheNestedClass() {
		System.out.println(NestedStaticClass.name);
		//System.out.println(NestedStaticClass.age);
	}
	public static class NestedStaticClass {
		private static String name = "IT Talents";
		private String age = "Twenty";
		
		public void printMemberFromOuter() {
			System.out.println(count);
			//System.out.println(value);
		}
	}
	
	void useMemberFromInnerClass() {
		InnerClass inner = new InnerClass();
		System.out.println(inner.age);
		System.out.println(inner.name);
		inner.printMemberFromOuterClass();
	}
	public class InnerClass {
		private static final String name = "IT Talents";
		private String age = "Twenty";
		
		public void printMemberFromOuterClass() {
			System.out.println(count);
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		Outer.NestedStaticClass nsc = new Outer.NestedStaticClass();
		nsc.printMemberFromOuter();
		Outer o = new Outer();
		o.useMemberFromInnerClass();
		
	}
}
