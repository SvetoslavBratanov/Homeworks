package homework_8;
import java.util.Scanner;

public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printASCII();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		//String text = sc.nextLine();
		String text = "asd-12sfd45-56asdf100";
		int sum = 0;
		for(int i = text.length() - 1; i >= 0; i-- ) {
			int number = 0;
			int multiplier = 1;
			if(text.charAt(i) >= 48 && text.charAt(i) <= 57) {
				while((text.charAt(i) >= 48 && text.charAt(i) <= 57) || text.charAt(i) == '-'){
					if(text.charAt(i) == '-') {
						number *= -1;
						break;
					}
					number += (text.codePointAt(i) - 48) * multiplier;
//					System.err.println("\n" + "codePointAt: " + text.codePointAt(i));
//					System.err.println("number: " + number);
//					System.err.println("multiplier: " + multiplier + "\n");
					
					if(i > 0) {
						i--;
					} else {
						break;
					}
					multiplier *= 10;
				}
				System.out.println(number);
				sum += number;
			}
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}
	
	static void printASCII() {
		for(int i = 0; i <= 255; i++) {
			System.out.format(" %d -> %c ", i, i);
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}

}
