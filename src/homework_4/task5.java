package homework_4;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter the number to test: ");
		number = sc.nextInt();
		System.out.println();
		System.out.println(Integer.toBinaryString(number));
		System.out.println();
		
//		while(number > 0)
//		{
//			if(number % 2 == 0)
//			{
//				System.out.println("0"); 
//			}
//			else
//			{
//				System.out.println("1");
//			}
//			number = number/2;
//		}
				
		
		int multiplier = 1;
		int result = 0;
		
		while(number>0)	{
			int remainder = number % 2;
			number /= 2;
			System.out.print(" number " + number);
			System.out.print(" reminder " + remainder);
			result = result + remainder * multiplier;
			multiplier *= 10;
		}
		System.out.println();
		System.out.println("Binary representation of your number is:" + result);
		
		int m = 1;
		int r = 0;
		while(number > 0) {
			int rem = number % 2;
			number /= 2;
			r += rem * m;
			m *= 10;
		}
	}
}
