package homework_2;
import java.util.Scanner;

public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	
			System.out.println("Enter two numbers between 10 and 99.");
			System.out.println();
			System.out.println("Enter first number:");
			int a = sc.nextInt();
			System.out.println("Enter second number:");
			int b = sc.nextInt();
			
			int numberOfMultiplication = a * b;
			int lastDigit = numberOfMultiplication % 10;
			System.out.println("Number of multiplication is " + numberOfMultiplication);
			
			if(lastDigit % 2 == 0)
			{
				System.out.println("The last digit is even: " + lastDigit);
			}
			else
			{
				System.out.println("The last digit is odd: " + lastDigit);
			}
			
	}

}
