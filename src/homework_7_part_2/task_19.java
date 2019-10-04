package homework_7_part_2;

import java.util.Scanner;

public class task_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int length = sc.nextInt();
		int [] array = new int [length];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " element:" );
			array[i] = sc.nextInt();
		}
		int totalEvenElements = 0;
		int totalOddElements = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				totalEvenElements++;
			} else {
				totalOddElements++;
			}
		}
		System.out.println("Total even elements: " + totalEvenElements);
		System.out.println("Total odd elements: " + totalOddElements);
		sc.close();
	}
	
}
