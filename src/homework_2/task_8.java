package homework_2;
import java.util.Scanner;

public class task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number;
		
		do
		{
			System.out.println("Enter number between 1000 and 9999 to test:");
			number = sc.nextInt();
			if(number < 1000 || number > 9999)
			{
				System.out.println("Invalid number.Try again.");
				System.out.println();
			}
			
		}while(number < 1000 || number > 9999);
		
		
		int firstDigit = (number/1000);
		int secondDigit = (number/100) % 10;
		int thirdDigit = (number/10) % 10;
		int fourthDigit = number % 10;
		
		int newNumber_1 = firstDigit * 10 + fourthDigit;
		int newNumber_2 = secondDigit * 10 + thirdDigit;
		
		System.out.println();
		
		if(newNumber_1 < newNumber_2)
		{
			System.out.println(+ newNumber_1 + " is less then " + newNumber_2);
		}
		else if(newNumber_1 > newNumber_2)
		{
			System.out.println(+ newNumber_1 + " is bigger then " + newNumber_2);
		}
		else
		{
			System.out.println(+ newNumber_1 + " is equal to " + newNumber_2);
		}
		
		

	}

}
