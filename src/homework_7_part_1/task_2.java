package homework_7_part_1;

public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,1,4,2,7,6,10,11};
		boolean jagged = true;
		for(int i = 1; i < array.length - 1; i += 2) {
			if (!((array[i] < array[i - 1] && array[i] < array[i + 1]) || (array[i] > array[i - 1] && array[i] > array[i + 1]))) {
				jagged= false;
				break;
			}
				
		}
		if(jagged) {
			System.out.println("The numbers are jagged.");
		} else {
			System.out.println("The numbers are not jagged.");
		}
		

	}

}
