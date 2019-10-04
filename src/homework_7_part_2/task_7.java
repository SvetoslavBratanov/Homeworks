package homework_7_part_2;

import java.util.Scanner;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = {3,17,4,25,28,53,41,2};
		int [] array2 = new int [array.length + 1];
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + (i == array.length - 1 ? " " : ", "));
		}
		System.out.println();
		System.out.println("Enter value of element of array:");
		int element = sc.nextInt();
		System.out.println("Enter position of element of array:");
		int position = sc.nextInt();
		if(position < array2.length && position >= 0) {
			for(int i = 0; i < array2.length; i++) {
				if(i < position) {
					array2[i] = array[i];
				} else if (i == position) {
					array2[i] = element;
				} else {
					array2[i] = array[i - 1];
				}
			}
			System.out.println("New array is:");
			for(int i = 0; i < array2.length; i++) {
				System.out.print(array2[i] + (i == array2.length - 1 ? " " : ", "));
			}
		} else {
			System.out.println("Array doesn't contain that position.");
		}
		sc.close();
	}

}
