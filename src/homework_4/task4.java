package homework_4;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number,i;
		boolean is_prime = true;
		
		System.out.println("Enter the number to test: ");
		number = sc.nextInt();
		
		for(i = 2; i < number; i++)	{
			if((number % i) == 0) {
				is_prime=false;
				break;
			}
		}
		

		if(is_prime) {
			System.out.println("The number is prime.");
		} else {
			System.out.println("The number is not prime.");
		}

	}

}
