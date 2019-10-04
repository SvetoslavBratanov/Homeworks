package test;


public class Person extends Opa implements IBiju, IPlay{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}
	
	public static void main(String[] args) {
//		Person pesho = new Person("Pesho", 18);
//		Person ginka = new Person("Ginka", 19);
//		ginka.name = pesho.name;
//		ginka.age = pesho.age;
//		System.out.println(ginka.equals(pesho));
//		ginka = pesho;
//		System.out.println(ginka.equals(pesho));
//		pesho.information();
//		IBiju.anotherInfo();
//		IBiju gosho = new Person("Gosho", 21);
//		gosho = (Person) ginka;
//		System.out.println(gosho.toString());
		
		Person joro = new Person();
		Person mitko = new Person();
		joro.age = 18;
		mitko = joro;
		mitko.age = 21;
		System.out.println(joro.age);
				
	}
	@Override
	public void getNumber() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void opa() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void information() {
		IBiju.super.information();
		IPlay.super.information();
		System.out.println("haha");
	}

}
