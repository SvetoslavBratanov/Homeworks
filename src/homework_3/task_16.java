package homework_3;
import java.util.Scanner;

public class task_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers between 10 and 5555.");
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("Enter second number:");
		int m = sc.nextInt();
		System.out.println();
		
		if(n < 10 || n > 5555 || m < 10 || m > 5555 ) {
			System.out.println("The entered numbers is not in range.Try again.");
		} else {
			if(n > m) {
				if(n - m < 50) {
					System.out.println("In the entered space there are no numbers divided by 50.");
				}
				for(int i = n; i >= m; i--)	{
					if(i % 50 == 0)	{
						if(m + 50 > i) {
							System.out.print(i + ". ");
						} else {
							System.out.print(i + ", ");
						}
						
					}
				}
			}
			else if(m > n) {
				if(m - n < 50) {
					System.out.println("In the entered space there are no numbers divided by 50.");
				}
				for(int j = m; j >= n; j--)	{
					if(j % 50 == 0)	{
						if(n + 50 > j) {
							System.out.print(j + ". ");
						} else {
							System.out.print(j + ", ");
						}
					}
				}
			} else {
				System.out.println("In the entered space there are no numbers divided by 50.");
			}
						
		}
	}
}
