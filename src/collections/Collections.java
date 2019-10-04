package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		
		List<Integer> aList = new ArrayList<Integer>(2);
		aList.add(1);
        aList.add(5);
        aList.add(9);

        // adding element 25 at 3rd position which is index 2
        //aList.add(2,25);
        //((ArrayList) aList).ensureCapacity(20);
        for(Iterator<Integer> it = aList.iterator(); it.hasNext();) {
        	System.out.println(it.next());
        }
        //System.out.println("Integer List After 25 added at index 2 = " + aList);

        //String ArrayList

        List<String> sList = new ArrayList<String>();

        sList.add("JAVA");
        sList.add("At");
        sList.add("AbhiAndroid");

        //Adding Learning String at index 0 i.e. 1st position
        sList.add(0, "Learning");

        System.out.println("String After Learning Added at index 0 = " + sList);

	}
}
