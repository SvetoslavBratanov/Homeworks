package homework_4;
import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		System.out.println("Enter position b (b < 7):");
		int b = sc.nextInt();
		System.out.println("Enter position c (c < 7):");
		int c= sc.nextInt();
		System.out.println(Integer.toBinaryString(a));
		a = a^(1<<b);
		int q = 1<<b;
		System.out.println("1 << b - " + q);
		System.out.println("1 << b - " + Integer.toBinaryString(q));
		System.out.println("a1 : " + a + " - " + Integer.toBinaryString(a));
		a = a^(1<<c);
		q = 1<<c;
		System.out.println("1 << c - " + q);
		System.out.println("1 << c - " + Integer.toBinaryString(q));
		System.out.println("a2 : " + a + " - " + Integer.toBinaryString(a));
		
		System.out.println("a final: " + a);
		System.out.println(Integer.toBinaryString(a));
		
//		System.out.println(1<<3);
//		System.out.println(1^6);
	}

}
