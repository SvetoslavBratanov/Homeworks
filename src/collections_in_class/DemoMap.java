package collections_in_class;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("tisho", 10);
		map.put("misho", 40);
		System.out.println(map.size());
		
		for ( Iterator<String> it = map.keySet().iterator(); it.hasNext(); ) {
			System.out.println(map.get(it.next()));
		}
		for ( Entry<String, Integer> p : map.entrySet()) {
			System.out.println(p.getKey());
			System.out.println(p.getValue());
		}
		

	}

}
