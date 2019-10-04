package homework_7_part_2;

public class task_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		int [] array = {1, 6, 3, 5, 7, 7, 3, 7, 8, 9, 6, 9};
		System.out.println("Unique elements:");
		for(int i = 0; i < array.length; i++) {
			for (j = 0; j < i; j++){
				if (array[i] == array[j]) {
					break;
				}     
			}   
			if (i == j){
				System.out.print(array[i] + " ");
			}
		}
	}

}
