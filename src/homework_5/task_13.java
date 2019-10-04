package homework_5;
import java.util.Scanner;

public class task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter number:");
		int number = sc.nextInt();
		int temp = number;
		int digits = 0;
		while(temp > 0) {
			temp /= 2;
			digits++;
		}
		
		int [] array = new int [digits];
		for(int i = array.length - 1; i >= 0; i--) {
			int remainder = number % 2;
			array[i] = remainder;
			number /= 2;
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		sc.close();
		
	}

}
