package homework_7_part_2;

import java.util.Scanner;

public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to test:");
		int number = sc.nextInt();
		int [] array = {12,16,9,24,36,5};
		boolean isContain = false;
		for(int i  = 0; i < array.length; i++) {
			if(array[i] == number) {
				isContain = true;
				break;
			}
		}
		if(isContain) {
			System.out.println("The array contains entered number.");
		} else {
			System.out.println("The array not contains entered number.");
		}
		
		sc.close();
	}

}
