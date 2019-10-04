package homework_4;
import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number to test: ");
		number = sc.nextInt();

		int sum = 0;
		
		while(number>0)	{
			int remainder = number % 2;
			
			sum += remainder;
			number /= 2;
		}
		System.out.println(sum);
		
		while(number > 0) {
			if(number % 2 == 0) {
				sum++;
			}
			number /= 2;
		}
		
		System.out.println(sum);
	}

}
