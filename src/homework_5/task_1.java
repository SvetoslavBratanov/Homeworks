package homework_5;

public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {3, 5, 8, -3, 7, -27, 21, 99, 18};
		int temp = Integer.MAX_VALUE;
		//int temp = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0) {
				if(temp > array[i]) {
				temp = array[i];
				}
			}
		}
		System.out.println("The smallest number multiple of 3 is: " + temp);
	}
}
