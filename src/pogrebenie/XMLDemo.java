package pogrebenie;

import com.thoughtworks.xstream.XStream;

public class XMLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XStream xstream = new XStream();
		xstream.alias("person", Person.class);
		Person pesho = new Person("Pesho", 23, "piqndeto", "ginkaEN1");
		String xml = xstream.toXML(pesho);
		System.out.println(xml);
		
//		Person newPesho = (Person)xstream.fromXML(xml);
//		System.out.println(newPesho);
		
//		XStream xstream = new XStream();
//		xstream.alias("person", Person.class);
		Person gosho = new Person("Goshko", 22, "thehacker", "HeyILikeYou");
		xml = xstream.toXML(gosho);
		System.out.println(xml);

//		Person newGoshko = (Person) xstream.fromXML(xml);
//		System.out.println(newGoshko);
	}

}
