package json_xml;

import java.util.ArrayList;
import java.util.List;

public class Person {

	String name;
	int age;
	List<String> hobbies;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, List<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = new ArrayList<String>();
		hobbies.add("Doing sport");
		hobbies.add("Playing guitar");
		hobbies.add("Reading books");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
}
