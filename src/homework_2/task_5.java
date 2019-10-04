package homework_2;
import java.util.Scanner;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter first number:");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number:");
		int secondNumber = sc.nextInt();
		System.out.println("Enter third number:");
		int thirdNumber = sc.nextInt();
		
		if(firstNumber >= secondNumber && firstNumber >= thirdNumber)
		{
			if(secondNumber >= thirdNumber)
			{
				System.out.println(firstNumber + " > " + secondNumber + " > " + thirdNumber);
			}
			else 
			{
				System.out.println(firstNumber + " > " + thirdNumber + " > " + secondNumber);
			}
		}
		
		if(secondNumber >= firstNumber && secondNumber >= thirdNumber)
		{
			if(firstNumber >= thirdNumber)
			{
				System.out.println(secondNumber + " > " + firstNumber + " > " + thirdNumber);
			}
			else 
			{
				System.out.println(secondNumber + " > " + thirdNumber + " > " + firstNumber);
			}
		}
		
		if(thirdNumber >= secondNumber && thirdNumber >= firstNumber)
		{
			if(secondNumber >= firstNumber)
			{
				System.out.println(thirdNumber + " > " + secondNumber + " > " + firstNumber);
			}
			else 
			{
				System.out.println(thirdNumber + " > " + firstNumber + " > " + secondNumber);
			}
		}

	}

}
