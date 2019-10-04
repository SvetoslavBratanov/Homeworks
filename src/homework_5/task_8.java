package homework_5;

public class task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array =  {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};
		
		int currentCount = 0;
		int currentElement = array[0];
		int counter = 0;
		int element = 0;
	
		for (int i = 0; i < array.length; i++) {
			if (currentElement == array[i]) {
				currentCount++;
			} else {
				if (currentCount > counter) {
					counter = currentCount;
					element = currentElement;
				}
				currentCount = 1;
				currentElement = array[i];
			}
		}
		if (currentCount > counter) {
			counter = currentCount;
			element = currentElement;
		}
		System.out.println("The longest row of the same consistent elements in an array is: "); 
		for (int i = 0; i < counter; i++) {
			System.out.print(element + (i == counter - 1 ? " " : ", "));
		}
	}

}

