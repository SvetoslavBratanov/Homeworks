package homework_7_part_2;

public class task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] array = {4, 103, 57, 86, -12, 33, 91};
		 int minValue = array[0];
		 int maxValue = array[0];
		 for(int i = 0; i < array.length; i++) {
			 if(array[i] > maxValue) {
				 maxValue = array[i];
			 } else if (array[i] < minValue) {
				 minValue = array[i];
			 }
		 }
		 System.out.println("Maximum value of an array is: " + maxValue);
		 System.out.println("Minimum value of an array is: " + minValue);
	}
}
