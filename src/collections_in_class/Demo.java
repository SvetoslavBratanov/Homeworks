package collections_in_class;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.omg.Messaging.SyncScopeHelper;

public class Demo {
static final int COUNT_OF_ELEMENTS = 252;
	
	public static void main(String[] args) throws Exception {
		
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("Pesho");
		list.add("Ivan");
		list.add("Stanka");
		list.add("Ginka");
		list.add("Dimcho");
		list.add("Stefi");
		list.add("Minka");
		list.add("Ivajlo");
		list.add("Gosho");
		list.add("Svinka");
		list.add("Golemiq");
		list.add("Malkiq");
		list.add("PuhiPernichankata");
		list.add(null);
		
		
		list.forEach(p -> System.out.println(p));
		
		//System.out.println(list.size());
		//list.addAll(index, c)
		list.addAll(Arrays.asList("Sasho", "Penka", "Slavi"));
		
		
		list.forEach(p -> System.out.println(p));
		
		
		
		System.out.println(list.contains(new String("PuhiPernichankata")));
		
		ArrayList<Person> hora = new ArrayList<Person> ();
		hora.add(new Person("Pesho", 30));
		hora.add(new Person("Stefi", 30));
		hora.add(new Person("Niki", 30));
		hora.add(new Person("Dido", 30));
		hora.add(new Person("Ginka", 30));
		hora.add(new Person("Svinka", 30));
		hora.add(null);
		hora.add(new Person("Svincho", 30));
		hora.add(new Person("Puhi", 30));
		
		System.out.println(hora.size());
		
		hora.get(10);
		
//		System.out.println(hora.remove(new Person("Dido", 30)));
//		System.out.println(hora.size());
//		
//		for ( Person p : hora) {
//			System.out.println(p.name);
//		}
//		
//		hora.forEach(p -> System.out.println(p.name));
//		
//		//hora.removeIf(p->p.name.contains("S"));
//		System.out.println("AFTER REMOVING");
//		hora.forEach(p -> System.out.println(p.name));
//		
//		for ( Iterator<Person> it = hora.iterator(); it.hasNext(); ) {
//			
//			Person p =it.next();
//			System.out.println("Kazvam se " + p.name);
//			if (p.name.equals("Stefi")) {
//				it.remove();
//			}
//		}
//		
//		hora.forEach(p -> System.out.println(p.name));
		
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i <= COUNT_OF_ELEMENTS; i++) {
//            list.add(i);
//            System.out.format("Size: %2d, Capacity: %2d%n",
//                              list.size(), getCapacity(list));
//        }
//        
//        list.clear();
//        System.out.println(list.isEmpty());
//        
//        System.out.format("Size: %2d, Capacity: %2d%n",
//                list.size(), getCapacity(list));
//        System.out.println("REMOVING");
//        
//        for (int i = COUNT_OF_ELEMENTS; i > 0; i--) {
//            list.remove(i);
//            System.out.format("Size: %2d, Capacity: %2d%n",
//                              list.size(), getCapacity(list));
//            list.trimToSize();
//        }
        
        
    }

    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		

		
		
		

//	}

}
