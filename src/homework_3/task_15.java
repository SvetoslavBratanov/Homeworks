package homework_3;
import java.util.Scanner;

public class task_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		 
		sum = 0;
		int j = 0;
		do {
			sum += j;
			j++;
		}while(j <= n);
		
		System.out.println(sum);
	}

}
