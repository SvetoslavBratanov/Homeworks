package collections_in_class;
import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Person> kadeti = new HashSet<Person>();
		Person misho1 = new Person("Misho", 50);
		Person misho2 = new Person("Misho", 40);
		Person misho3 = new Person("Misho", 60);
		Person misho4 = new Person("Misho", 30);
		Person misho5 = new Person("Misho", 10);
		System.out.println(misho1.hashCode());
		System.out.println(misho2.hashCode());
		kadeti.add(misho1);
		kadeti.add(misho2);
		kadeti.add(misho3);
		kadeti.add(misho4);
		kadeti.add(misho5);
		
		System.out.println(kadeti.size());
		kadeti.forEach(p -> System.out.println(p));
		
		
	}

}
