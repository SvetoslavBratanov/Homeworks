package homework_7_part_2;

import java.util.Scanner;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = {3,17,4,25,28,53,41,2};
		System.out.println("Enter number:");
		int number = sc.nextInt();
		boolean isContain = false;
		int index = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				isContain = true;
				index = i;
				break;
			}
		}
		if(isContain) {
			System.out.println("The index of entered element is: " + index);
		} else {
			System.out.println("The array not contains entered number.");
		}
		sc.close();
	}

}
