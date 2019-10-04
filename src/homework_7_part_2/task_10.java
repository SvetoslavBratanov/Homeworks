package homework_7_part_2;

public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4, 25, 2, 2, 62, -15, 3, -19, 4, 6};
		 for (int i = 0; i < arr.length - 1; i++) {
			 for (int j = i + 1; j < arr.length; j++) {
				 if (arr[i] == arr[j]) {
					 System.out.println("Duplicate element : " + arr[j]);
	             }
			 }
		 }
	}

}