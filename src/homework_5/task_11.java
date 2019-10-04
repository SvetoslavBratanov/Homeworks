package homework_5;
import java.util.Scanner;

public class task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = new int [7];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " element:");
			array[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + "; ");
				count++;
			}
		}
		if(count != 0) {
			System.out.print(" -> " + count + " numbers");
		} else {
			System.out.println("There are no numbers to fulfill the condition.");
		}
		
		
		sc.close();
	}

}
