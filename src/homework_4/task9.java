package homework_4;
import java.util.Random;
import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of triangle:");
		int x = sc.nextInt();
		System.out.println();
		int spaceNumber = x - 1;
		int starsNumber = 1;
		int innerSpace = 1;
		
		for(int i = 1; i<=x; i++) {
			for(int j = 0; j<spaceNumber; j++) {
				System.out.print(" ");
			}
			if( i == 1 || i == x) {
				for(int p = 0; p<starsNumber; p++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for(int s = 0; s< innerSpace; s++) {
					System.out.print(" ");
					int r = new Random().nextInt();
					System.out.print(r);
				}
				System.out.print("*");
				innerSpace += 2; 
			}
			spaceNumber -= 1;
			starsNumber += 2;
			System.out.println();
			
		}
		
	}
}
