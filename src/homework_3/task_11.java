package homework_3;

public class task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int spaceNumber = x - 1;
		int starsNumber = 1;
		
		for(int i = 1; i<=x; i++) {
			
			for(int j = 0; j<spaceNumber; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<starsNumber; k++) {
				System.out.print("*");
			}
			spaceNumber -= 1;
			starsNumber += 2;
			System.out.println();
		 }

	}
}
