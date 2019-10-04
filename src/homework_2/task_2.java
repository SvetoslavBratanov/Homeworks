package homework_2;
import java.util.Scanner;

public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter value of A:");
		a = sc.nextInt();
		System.out.println("Enter value of B:");
		b = sc.nextInt();
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		
		System.out.println("A + B = " + sum);
		System.out.println("A - B = " + sub);
		System.out.println("A * B = " + mul);
		System.out.println("A / B = " + div);
		System.out.println("A % B = " + mod);
	}

}
