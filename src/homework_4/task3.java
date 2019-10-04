package homework_4;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
//		System.out.println("Input two numbers in ascending order.");
//		System.out.println();
		
		System.out.println("Enter first number:");
		a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();
		
		if(a > b) {
			for(int i = b; i < a; i++) {
				if(i % 3 == 0) {
					System.out.println(i);
				}
			}
		}
		else if(b > a) {
			for(int i = a; i < b; i++) {
				if(i % 3 == 0) {
					System.out.println(i);
				}
			}
		}
		else{
			System.out.println("First number = second number");
		}

	}

}
