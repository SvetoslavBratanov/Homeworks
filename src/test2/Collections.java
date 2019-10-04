package test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Collections {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("1");
		l.add(2);
		//l.remove(0);
		l.clear();
		//System.out.println(l.contains(1));
		for(Iterator it = l.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
		Stack stack = new Stack();
		stack.push(4);
		stack.push(16);
		stack.push(32);
		stack.pop();
		
		
		System.out.println(stack);
		System.out.println(stack.peek());
		
		Queue que = new LinkedList();
		que.offer(1);
		que.remove(1);
		que.poll();
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(47); // legal: 47 is automatically boxed
		int a = myList.get(0); // legal: a is automatically unboxed
		System.out.println(a);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pesho", 22);
		map.put("Gosho", 24);
		map.put("Misho", 23);
		map.put("Sasho", 27);
		
		System.out.println(map.remove("Pesho", 22));
		System.out.println(map.containsKey("Misho"));
		Collection values = map.values();
//		for(Object value : values) {
//			System.out.println(value);
//		}
//		System.err.println(map.get("Gosho"));
		
		
		map.forEach((k, v) -> System.out.println("Name: " + k + " " + "Age: " + v ));
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		for ( Iterator<String> it = map.keySet().iterator(); it.hasNext(); ) {
			System.err.println(map.get(it.next()));
		}
	}
}
