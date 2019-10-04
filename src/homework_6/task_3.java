package homework_6;

public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2d = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		int sum = 0;
		int counter = 0;
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
				sum += array2d[i][j];
				counter ++;
			}
		}
		float average = (float) sum / counter;
		System.out.println("Sum of all elements is: " + sum);
		System.out.println("Average of all elements is: " + average);
	}

}
