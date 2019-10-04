package demoJsonAndXml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class JsonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person pesho = new Person("Pesho", 23, "piqndeto", "ginkaeN1");
		XStream xstream = new XStream(new JsonHierarchicalStreamDriver());
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.alias("pesho", Person.class);
	    System.out.println(xstream.toXML(pesho));
	    
	    System.out.println();
	    
//	    XStream xstream2 = new XStream(new JettisonMappedXmlDriver());
//	    xstream2.setMode(XStream.NO_REFERENCES);
//		xstream2.alias("pesho", Person1.class);
//	    System.out.println(xstream2.toXML(pesho));
	    
	    
	}
}
