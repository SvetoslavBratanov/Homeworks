package homework_3;
import java.util.Scanner;

public class task_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 and 999:");
		int number = sc.nextInt();
		int i = 1;
		
		if(number < 1 || number > 999) {
			System.out.println("The entered number is not in range.Try again.");
		}
		else {
			while(i < 11) {
				number++;
				if(i == 10 && (number % 2 == 0 || number % 3 == 0 || number % 5 == 0)) {
					System.out.print(i + ":" + number);
					break;
				} else if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
					System.out.print(i + ":" + number + ", ");
					i++;
				}				
			}
		}	
	}
}
