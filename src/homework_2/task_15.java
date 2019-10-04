package homework_2;
import java.util.Scanner;

public class task_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour between 0 and 24.");
		int hour = sc.nextInt();
		System.out.println();
		
		if(hour < 0 || hour > 24)
		{
			System.out.println("The entered hour is not in the range.");
		}
		else
		{
			if(hour > 4 && hour <= 9)
			{
				System.out.println("Good morning.");
			}
			else if(hour > 9 && hour <= 18)
			{
				System.out.println("Good afternoon.");
			}
			else
			{
				System.out.println("Good evening.");
			}
		}
		

	}

}
