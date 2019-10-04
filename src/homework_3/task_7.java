package homework_3;
import java.util.Scanner;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int x = 3;
		for(int i = 1; i <= n; i++)	{	
			if(i < n) {
				System.out.print(x + ", ");
			}
			else {
				System.out.print(x);
			}
			x += 3;
		}

	}

}
