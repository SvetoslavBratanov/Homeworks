package homework_5;
import java.util.Scanner;

public class task_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int length = sc.nextInt();
		int [] array = new int[length];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " element");
			array[i] = sc.nextInt();
		}
		
		//int [] array = {3,7,2,8,4,9,1,10,3,5};
		//int [] array = {7,15,3,19,1,186,13,76};
		boolean isZigzagged = true;
		for(int i = 1; i < array.length - 1; i += 2) {
			if (!(array[i] > array[i - 1] && array[i] > array[i + 1])) {
				isZigzagged = false;
				break;
			}
		}
		if(isZigzagged) {
			System.out.println("The numbers are arranged in a zigzag row.");
		} else {
			System.out.println("The numbers are not arranged in a zigzag row.");
		}
		
		sc.close();
	}

}
