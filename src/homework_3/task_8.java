package homework_3;
import java.util.Scanner;

public class task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int num2 = n - 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(num2);
			}
			System.out.println();
			num2 += 2;
		}

	}

}

