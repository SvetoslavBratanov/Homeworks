package homework_3;

public class task_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstDigit, secondDigit, thirdDigit;
		for(int i = 100; i < 1000; i++) {
			firstDigit = i / 100;
			secondDigit = i % 100 / 10;
			thirdDigit = i % 10;
			if(firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit) {
				System.out.println(i);
			}
		}

	}

}
