package homework_9;
import java.util.Scanner;

public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers greater than or equal to 2.");
		int firstNumber = 0;
		int secondNumber = 0;
		do {
			System.out.println("\nEnter first number:");
			firstNumber = sc.nextInt();
			System.out.println("Enter second number:");
			secondNumber = sc.nextInt();
		} while(firstNumber < 2 || secondNumber < 2);
		System.out.println(multiply(firstNumber, secondNumber));
		sc.close();
		
	}
	
	static int multiply(int n, int m) {
		if(m == 1) {
			return n;
		}
		return multiply(n,m-1) + n;
	}
}
