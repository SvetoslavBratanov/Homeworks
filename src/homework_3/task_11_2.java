package homework_3;

public class task_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
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
				for(int s = 0; s < innerSpace; s++) {
					System.out.print(" ");
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
