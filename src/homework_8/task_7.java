package homework_8;

import java.util.Scanner;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String text = sc.nextLine();
		text = text.trim();
		String [] numberOfWords = text.split(" ");
		System.out.print(numberOfWords.length + (numberOfWords.length == 1? " word, " : " words, " ));
		int counter = 0;
		int maxSymbols = 0;
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) != ' ') {
				counter++;
			}
			if (counter > maxSymbols) {
				maxSymbols = counter;
			}
			if ((text.charAt(i) == ' ')) {
				counter = 0;
			}		
		}
		if(numberOfWords.length == 1) {
			System.out.println(" it is " + maxSymbols + " characters long.");
		} else {
			System.out.println("the longest is " + maxSymbols + " characters long.");
		}
		sc.close();
	}

}
