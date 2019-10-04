package homework_7_part_2;

public class task_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { -1, 12, 33, 12, 33, 44, 5, -65, 84, 33, 23 };// array of ten    
        // elements
        int size = array.length;
        System.out.println("Size before remove elements: " + size);

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    while (j < (size) - 1) {
                        array[j] = array[j + 1];// shifting the values
                        j++;
                    }   
                    size--;
                }
            }
        }
        System.out.println("Size after remove eleemnts: " + size);

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + (i == size - 1 ? " " : ", ")); 
        }
	}

}
