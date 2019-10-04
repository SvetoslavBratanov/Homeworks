package homework_9;
import java.util.Scanner;

public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to test:");
		int number = sc.nextInt();
		System.out.println(fibonacci(number));
		sc.close();
	}
	
	static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
