package homework_3;
import java.util.Scanner;

public class task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum between 2 and 27:");
		int sum = sc.nextInt();
		int firstDigit, secondDigit, thirdDigit;
		if(sum < 2 || sum > 27)	{
			System.out.println("The entered number is not in range.Try again.");
		} else {
			for(int i = 100; i < 1000; i++)	{
				firstDigit = i / 100;
				secondDigit = i % 100 / 10;
				thirdDigit = i % 10;
				if(firstDigit + secondDigit + thirdDigit == sum) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
