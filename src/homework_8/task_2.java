package homework_8;
import java.util.Scanner;
public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = 0;
		String text1;
		String text2;
		do {
			System.out.println("Enter string with length 10-20 characters.");
			//System.out.println("Enter first word:");
			text1 = sc.next();
			//System.out.println("Enter second word:");
			text2 = sc.nextLine();
			length = text1.length() + text2.length();
			if(length < 10 || length > 20) {
				System.out.println("Entered string is not in range.Try again.");
			}
		} while(length < 10 || length > 20);
	
		StringBuilder newText1 = new StringBuilder(text1);
		StringBuilder newText2 = new StringBuilder(text2);
		for (int i = 0; i < 5; i++) {
			char temp1 = newText1.charAt(i);
			char temp2 = newText2.charAt(i);
			newText1.setCharAt(i, temp2);
			newText2.setCharAt(i, temp1);
		}
		text1 = newText1.toString();
		text2 = newText2.toString();
		System.out.println(text1.length() > text2.length() ? text1.length() + " " + text1 : text2.length() + " " + text2);
		sc.close();
	}

}
