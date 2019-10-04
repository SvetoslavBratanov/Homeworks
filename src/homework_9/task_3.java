package homework_9;
import java.util.Scanner;

public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to test:");
		int number = sc.nextInt();
		System.out.println(isPrime(number, 2 ) ? "The number is prime." : "The number isn't prime.");
		sc.close();

	}
			
	static boolean isPrime(int x, int divisor) {
		if(divisor == x) {
			return true;
		}
		if(x % divisor == 0) {
			return false;
		}
		return isPrime(x, divisor + 1);
	}

}
