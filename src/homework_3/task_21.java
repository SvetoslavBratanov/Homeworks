package homework_3;
import java.util.Scanner;

public class task_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of card between 1 and 52:");
		int number = sc.nextInt();
		if(number < 1 || number > 52) {
			System.out.println("The entered number is not in range.Try again.");
		} else {
			for(int card = number; card <= 52; card++) {
				
				int cardNumber = (card - 1) / 4 + 1;
				int paintOfCard = card % 4;
				
				switch(cardNumber) {
				case 1: 
					System.out.print("Two of "); 
					break;
				case 2: 
					System.out.print("Three of ");
					break;
				case 3:	
					System.out.print("Four of ");
					break;
				case 4:	
					System.out.print("Five of ");
					break;
				case 5: 
					System.out.print("Six of ");
					break;
				case 6:	
					System.out.print("Seven of ");
					break;
				case 7: 
					System.out.print("Eight of ");
					break;
				case 8: 
					System.out.print("Nine of ");
					break;
				case 9: 
					System.out.print("Ten of ");
					break;
				case 10: 
					System.out.print("Jack of ");
					break;
				case 11: 
					System.out.print("Queen of ");
					break;
				case 12: 
					System.out.print("King of ");
					break;
				case 13: 
					System.out.print("Ace of ");
					break;
				}				
				switch(paintOfCard) {
				case 1:
					System.out.print("clubs");
					break;
				case 2:
					System.out.print("diamonds");
					break;
				case 3:
					System.out.print("hearts");
					break;
				case 0:
					System.out.print("spades");
					break;
				default: 
					System.out.println();
				}
				if(card < 52) {
					System.out.print(", ");
				}
			}
		}		
		
	}

}
