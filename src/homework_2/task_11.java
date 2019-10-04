package homework_2;
import java.util.Scanner;

public class task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three-digit number without zero:");
		int number = sc.nextInt();
		
		int firstDigit = number / 100;
		int secondDigit = (number/10) % 10;
		int thirdDigit = number % 10;
		
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		
		if(number<100 || number > 999)
		{
			System.out.println("You did't enter a three-digit number");
		}
		
		else
		{
			if(firstDigit != 0 && secondDigit != 0 && thirdDigit != 0)
			{	
				if(number % firstDigit == 0 && number % secondDigit == 0 && number % thirdDigit == 0)
				{
					System.out.println("The number is divided by each digit.");
				}
				else
				{
					System.out.println("The number is not divisible by each digit.");
				}
				
			}
			
			else
			{
				System.out.println("The entered number contains zero.");
				System.out.println("Please try again.");
			}
			
		}
		
		
		

	}

}
