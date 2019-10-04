package homework_3;
import java.util.Scanner;

public class task_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers between 1 and 9.");
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		if(a < 1 || a > 9 || b < 1 || b > 9) {
			System.out.println("The entered number is not in range. Try again.");
		} else {
			if(a >= b) {
				for(int i = 1; i <= a; i++)	{
					for(int j = 1; j <= b; j++)	{
						System.out.println(i + "*" + j + " = " + i*j);
					}
				}
			} else {
				for(int i = 1; i <= b; i++)	{
					for(int j = 1; j <= a; j++)	{
						System.out.println(i + "*" + j + " = " + i*j);
					}
				}
			}
			
		}
	}
}
