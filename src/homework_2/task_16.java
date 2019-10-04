package homework_2;
import java.util.Scanner;

public class task_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three-digit number:");
		int number = sc.nextInt();
		if(number < 100 || number > 999)
		{
			System.out.println("The entered number is not in the range.");
		}
		else
		{
			int a = number / 100;
			int b = (number/10) % 10;
			int c = number % 10;
			
			if(a == b && b == c)
			{
				System.out.println("The three digits are equal.");
			}
			else if(a > b && b > c)
			{
				System.out.println("The digits are in descending order.");
			}
			else if(a < b && b < c)
			{
				System.out.println("The digits are in ascending order.");
			}
			else
			{
				System.out.println("The digits are unassigned for unrecorded cases.");
			}
		}
		
		
	}

}
