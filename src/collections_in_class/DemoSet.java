package collections_in_class;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> torba = new TreeSet<String>();
		
		torba.add("Pari");
		torba.add("Glava");
		torba.add("Telefon");
		torba.add("IPhone 8");
		torba.add("Mirizlivi chorapi");
		torba.add("Torta Nedelq");
		torba.add("Noj");
		torba.add(new String("Noj"));
		
		System.out.println(torba.size());
		torba.forEach(p -> System.out.println(p));
		String s = "namek";
		Comparator c1;
		if ( s.equals("age") ) {
			c1 = new PersonComperatorByAge();
		} else if (s.equals("name")) {
			c1 = new PersonComparatorByName();
		} else {
			c1 = new PersonComparatorByNameAndAge();
		}
		
		Set<Person> kadetiNaInterview = new TreeSet<Person>(c1);
		kadetiNaInterview.add(new Person("Pesho", 50));
		kadetiNaInterview.add(new Person("Stefi", 10));
		kadetiNaInterview.add(new Person("Rali", 10));
		kadetiNaInterview.add(new Person("Traicho", 10));
		kadetiNaInterview.add(new Person("Mancho", 60));
		kadetiNaInterview.add(new Person("Gancho", 45));
		kadetiNaInterview.add(new Person("Stancho", 43));
		kadetiNaInterview.add(new Person("Stancho", 85));
		
		kadetiNaInterview.forEach(p -> System.out.println(p));
		
	}

}
