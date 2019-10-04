package homework_9;
import java.util.Scanner;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number:");
		int startNumber = sc.nextInt();
		System.out.println("Enter end number:");
		int endNumber = sc.nextInt();
		System.out.println();
		System.out.println(triangle(startNumber,endNumber));
		sc.close();
	}
	
	static String row(int n) {
		if (n == 1) {
			 return "1";
		} else {
			  return row(n - 1) + " " + n;
		}
	}

	static String triangle(int a, int b) {
		if (a == b) {
			return row(b);
		} else {
			return row(a) + "\n" + triangle(a + 1, b);
		}
    }
}
