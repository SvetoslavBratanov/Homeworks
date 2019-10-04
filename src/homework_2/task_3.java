package homework_2;
import java.util.Scanner;

public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber,secondNumber,temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number:");
		secondNumber = sc.nextInt();
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("First number is: " + firstNumber);
		System.out.println("Second number is: " + secondNumber);

	}

}
