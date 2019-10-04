package homework_3;
import java.util.Scanner;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		
		if(a > b) {
			for(int i = b; i <= a; i++) {
				if(i != a) {
					System.out.print(i + ", ");
				} else {
					System.out.println(i);
				}
			}
		}
		else if (b > a)	{
			for(int j = a; j <= b; j++)	{
				if(j != b) {
					System.out.print(j + ", ");
				} else {
					System.out.println(j);
				}
			}
		}
		else {
			System.out.println(a);
		}	
	}

}
