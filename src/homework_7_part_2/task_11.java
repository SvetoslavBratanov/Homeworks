package homework_7_part_2;

public class task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] firstArray = {3, 45, 78, 8, 80}; 
		int [] secondArray = {10, 8, 9, 3, 50, 12, 16, 18, 45};
		 for (int i = 0; i < firstArray.length; i++) {
			 for (int j = 0; j < secondArray.length; j++) {
				 if (firstArray[i] == secondArray[j]) {
					 System.out.println("Common element : " + firstArray[i]);
	             }
			 }
		 }
	}

}

