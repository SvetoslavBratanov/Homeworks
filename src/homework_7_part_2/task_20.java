package homework_7_part_2;

public class task_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {10, -2, 5, -20, 1, 50, 60, -50, -12, -9};
		int totalNumberOfNegative = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				totalNumberOfNegative++;
			}
		}
		System.out.println("Total number of negative elements are: " + totalNumberOfNegative);
	}

}
