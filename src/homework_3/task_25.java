package homework_3;
import java.util.Scanner;

public class task_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int temp = number;
		long factorial = 1;
		do {
			factorial *= number;
			number--;
		}while(number > 0);
		System.out.println(temp + "! = " + factorial);
	}

}
