package homework_3;
import java.util.Scanner;

public class task_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square:");
		int b = sc.nextInt();
		System.out.println("Enter symbol for inner space:");
		char c = sc.next().charAt(0);
		for(int i = 1; i <= b; i++) {
			if(i == 1 || i == b) {
				for(int j = 0; j < b; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for(int k = 0; k < b-2; k++) {
					System.out.print(c);
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
