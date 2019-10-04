package homework_3;


import java.util.Scanner;

public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		boolean is_prime = true;
		
		System.out.println("Enter the number to test: ");
		number = sc.nextInt();
		
		for(int i = 2; i < number; i++) {
			if((number % i) == 0) {
				is_prime=false;
				break;
			}
		}
		

		if(is_prime) {
			System.out.println("The number is prime.");
		} else {
			System.out.println("The number is not prime.");
		}

	}

}
