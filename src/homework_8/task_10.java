package homework_8;
import java.util.Scanner;

public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String text = sc.nextLine();
		StringBuilder newText = new StringBuilder(text);
		for (int i = 0; i < text.length(); i++) {
			newText.setCharAt(i, (char)(text.charAt(i) + 5));
		}
		text = newText.toString();
		System.out.println(text);
		sc.close();
	}

}
