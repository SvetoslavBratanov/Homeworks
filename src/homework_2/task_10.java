package homework_2;
import java.util.Scanner;

public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number between 10 and 9999");
		int x = sc.nextInt();
		
		int fullBuckets = x / 5;
		int remainder = x % 5;
		
		System.out.println(fullBuckets + " times 2 liters,");
		System.out.println(fullBuckets + " times 3 liters,");
		
		if(remainder == 0)
		{
			System.out.println("No additional bucket is required.");
		}
		else if (remainder > 0 && remainder <=2)
		{
			System.out.println("It is necessary one extra bucket of two liters.");
		}
		else if (remainder > 2 && remainder <= 3)
		{
			System.out.println("It is necessary one extra bucket of three liters.");
		}
		else
		{
			System.out.println("It is necessary one extra bucket of three "
					+ "liters and one extra bucket of two liters.");
		}
		

	}

}
