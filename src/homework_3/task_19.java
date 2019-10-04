package homework_3;
import java.util.Scanner;

public class task_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 10 and 99:");
		int number = sc.nextInt();
		if(number < 10 || number > 99) {
			System.out.println("The entered number is not in range.Try again.");
		} else {
			while(number != 1) {
				if(number % 2 == 0) {
					number *= 0.5;
					System.out.print(number + " ");
				} else {
					number = number*3 + 1;
					System.out.print(number + " ");
				}
			}
		}
	}
}
