package homework_3;
import java.util.Scanner;

public class task_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 10 and 30 000 to test:");
		int number = sc.nextInt();
		if(number < 10 || number > 30_000) {
			System.out.println("The entered number is not in range. Try again.");
		} else {
			int temp, remainder, reverse = 0;
			temp = number;
			do {
				remainder = temp % 10;
				reverse = reverse * 10 + remainder;
				temp = temp /10;
			}while(temp > 0) ;
			System.out.println("Reverse of entered number is: " + reverse);
			if(number == reverse) {
				System.out.println(number +" is palindrome number.");
			} else {
				System.out.println(number + " is not a palindrome number.");
			}
		}
	}
}
