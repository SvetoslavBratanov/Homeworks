package homework_8;

import java.util.Scanner;

public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to test:");
		String text = sc.nextLine();
		//System.out.println("Enter first string without spaces:");
		String [] words = text.split(", ");
		String text1 = words[0];
		//System.out.println("Enter second string without spaces:");
		String text2 = words[1];
		
		if (text1.length() == text2.length()) {
			System.out.println("The two strings have the same length.");
			System.out.println("Difference by positions:");
			boolean differnce = false;
			for (int i = 0; i < text1.length(); i++) {
				if (text1.charAt(i) != text2.charAt(i)) {
					differnce = true;
					System.out.println((i+1) + ") " + text1.charAt(i) + "-" + text2.charAt(i));
				}
			}
			if (!differnce) {
				System.out.println("The strings haven't got any difference.");
			}
		}
		else if (text1.length() > text2.length()) {
			System.out.println("Length of first string is more than length of second string.");
		}
		else {
			System.out.println("Length of second string is more than length of first string.");
		}
		sc.close();
	}

}
