package homework_8;
import java.util.Scanner;

public class task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = sc.nextLine();
		boolean palindrome = true;
		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
				palindrome = false;
				break;
			}
		}
		System.out.println(palindrome ? "The string is palindrome." : "The string isn't palindrome.");
		sc.close();
		
		// "debel arab bara lebed" is palindrome :D
		// "alenafanela" too :D
		// kapak
	}

}
