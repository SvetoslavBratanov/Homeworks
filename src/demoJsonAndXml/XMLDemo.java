package demoJsonAndXml;

import com.thoughtworks.xstream.XStream;

public class XMLDemo {

	public static void main(String[] args) {
		
		XStream xstream = new XStream();
		xstream.alias("person", Person.class);
		Person pesho = new Person("Pesho", 23, "piqndeto", "EasyPassword");
		String xml = xstream.toXML(pesho);
		System.out.println(xml);
	
		Person newPesho = (Person)xstream.fromXML(xml);
		System.out.println(newPesho);
	
		
	}

}
