package homework_8;
import java.util.Scanner;
public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String firstWord = sc.nextLine();
		System.out.println("Enter second string:");
		String secondWord = sc.nextLine();
		boolean equalSymbol = false;
		int secondIndex = 0;
		int firstIndex = 0;
		for (int i = 0; i < firstWord.length(); i++) {
			for (int j = 0; j < secondWord.length(); j++) {
				if (firstWord.charAt(i) == secondWord.charAt(j)) {
					firstIndex = i;
					secondIndex = j;
					equalSymbol = true;
				}
				
			}
			if (equalSymbol) {
				break;
			}
		}
		int shifts = firstIndex;
		System.out.println(shifts);
		if (equalSymbol) {
			for (int i = 0; i < secondWord.length(); i++) {
					if (secondIndex == i) {
						System.out.println(firstWord);
					}
					else {
						while(shifts > 0) {
							System.out.print(" ");
							shifts--;
						}
						shifts = firstIndex;
						System.out.println(secondWord.charAt(i));
					}
			}
		}
		else {
			System.out.println("The strings haven't got a common char.");
		}
		sc.close();
		
	}

}
