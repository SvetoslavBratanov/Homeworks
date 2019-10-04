package collections_in_class;
import java.util.Comparator;

public class PersonComperatorByAge implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.age-o2.age;
	}

}