package homework_7_part_2;

import java.util.Scanner;

public class task_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = {1, 7, -13, 9, 34, 21, 16, -1, 5, 3};
		System.out.println("Please, enter sum:");
		int sum = sc.nextInt();
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] + array[j] == sum && array[j] >= 0) {
					System.out.println(array[i] + " + " + array[j] + " = " + sum);
				} else if(array[i] + array[j] == sum && array[j] < 0) {
					System.out.println(array[i] + " + (" + array[j] + ") = " + sum);
				} 
			}
		}
		sc.close();
	}

}