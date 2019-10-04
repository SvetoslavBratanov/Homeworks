package homework_3;
import java.util.Scanner;

public class task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= x; i++)	{
			sum += i;
		}
		System.out.println(sum);
	}

}
