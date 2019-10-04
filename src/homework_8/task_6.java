package homework_8;
import java.util.Scanner;

public class task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine();
		sentence = sentence.trim();
		sentence = sentence.toLowerCase();
		for(int  i = 0; i < sentence.length(); i++) {
			if(i == 0 || sentence.charAt(i-1) == ' ') {
				System.out.print(sentence.toUpperCase().charAt(i));
			} else {
				System.out.print(sentence.charAt(i));
			}
		}
		/* The second way ->
		StringBuilder newSentence = new StringBuilder(sentence);
		newSentence.setCharAt(0, (char)(sentence.charAt(0) - 32));
		for (int i = 0; i < newSentence.length() - 1; i++) {
			if (newSentence.charAt(i) == ' ') {
				newSentence.setCharAt(i+1, (char) (newSentence.charAt(i+1) - 32));
			}
		}
		sentence = newSentence.toString();
		System.out.println("\nModified sentence:");
		System.out.println(sentence); */
		sc.close();
		
	}


}
