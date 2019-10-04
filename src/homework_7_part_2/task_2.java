package homework_7_part_2;

public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {51,7,12,4,6,80};
		int sum = 0;
		for(int i  = 0; i < array.length; i++) {
			sum += array[i];
		}
		float average = (float) sum/(array.length);
		System.out.println("The  average value of array elements is: " + average );
	}

}
