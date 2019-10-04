package homework_8;
import java.util.Scanner;
public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = 0;
		String text1;
		String text2;
		do {
			System.out.println("Enter first string up to 40 characters:");
			text1 = sc.nextLine();
			length = text1.length();
			if(length > 40) {
				System.out.println("Entered string contain more than 40 characters.Try again.");
			}
		} while(length > 40);
		do {
			System.out.println("Enter second string up to 40 characters:");
			text2 = sc.nextLine();
			length = text2.length();
			if(length > 40) {
				System.out.println("Entered string contain more than 40 characters.Try again.");
			}
		} while(length > 40);
		System.out.print(text1.toUpperCase() + "\t");
		System.out.print(text1.toLowerCase() + "\t");
		System.out.print(text2.toUpperCase() + "\t");
		System.out.print(text2.toLowerCase() + "\t");
		
		sc.close();
	}

}
