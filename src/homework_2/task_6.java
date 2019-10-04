package homework_2;
import java.util.Scanner;

public class task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		int temp = 0;
		System.out.println("Enter a1:");
		int a1 = sc.nextInt();
		System.out.println("Enter a2:");
		int a2 = sc.nextInt();
		System.out.println("Enter a3:");
		int a3 = sc.nextInt();
		
		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println("a1 -> a2 : a1 =  " + a1 );
		System.out.println("a2 -> a3 : a2 =  " + a2 );
		System.out.println("a3 -> a1 : a3 =  " + a3 );
		
	}

}
