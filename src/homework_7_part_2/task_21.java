package homework_7_part_2;

import java.util.Scanner;

public class task_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int length = sc.nextInt();
		int [] array = new int [length];
		int numberOfEven = 0;
		int numberOfOdd = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " element:" );
			array[i] = sc.nextInt();
			if(array[i] % 2 == 0) {
				numberOfEven++;
			} else {
				numberOfOdd++;
			}
		}
		int [] evenArray = new int [numberOfEven];
		int [] oddArray = new int [numberOfOdd];
		int j = 0;
		int k = 0;
		for(int i = 0; i < array.length; i++) {	
			if(array[i] % 2 == 0) {
				evenArray[j] = array[i];
				j++;
			} else {
				oddArray[k] = array[i];
				k++;
			}
		}
		System.out.print("Output even elements in array: ");
		for(int i = 0; i < evenArray.length; i++) {
			System.out.print(evenArray[i] + (i == evenArray.length - 1 ? " " : ", "));
		}
		System.out.println();
		System.out.print("Output odd elements in array: ");
		for(int i = 0; i < oddArray.length; i++) {
			System.out.print(oddArray[i] + (i == oddArray.length - 1 ? " " : ", "));
		}
		
		sc.close();
	}

}
