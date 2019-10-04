package homework_2;
import java.util.Scanner;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber,secondNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number:");
		secondNumber = sc.nextInt();
		
		if(firstNumber>secondNumber)
		{
			System.out.println(secondNumber + " -> " + firstNumber);
		}
		else
		{
			System.out.println(firstNumber + " -> " + secondNumber);
		}
		
	}

}
