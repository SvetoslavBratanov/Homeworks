package homework_3;
import java.util.Scanner;

public class task_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number (between 10 and 200) to test:");
		int number = sc.nextInt();
		if(number < 10 || number > 200) {
			System.out.println("The entered number is not in range.Try again.");
		} else {
			for(int i = number; i > 0; i--) {
				if(i % 7 == 0) {
					if(i != 7) {
						System.out.print(i + ", ");
					} else {
						System.out.println(i);
					}
					
				}
			}
		}
		
	}

}
