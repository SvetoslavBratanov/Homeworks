package homework_5;
import java.util.Scanner;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter length of array:");
		int length = sc.nextInt();
		int [] firstArray = new int [length];
		for(int i = 0; i < firstArray.length; i++){
			System.out.println("Please, enter " + i + " elemrnt:");
			firstArray[i] = sc.nextInt();
		}
		int [] secondArray = new int [length];
		for(int i = 0; i < secondArray.length; i++) {
			if(i == 0 || i == secondArray.length - 1) {
				secondArray[i] = firstArray[i];
			} else {
				secondArray[i] = firstArray[i-1] + firstArray[i+1];
			}
		}
		
		for(int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + (i == firstArray.length - 1 ? " " : ", "));
		}
		System.out.println();
		for(int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + (i == secondArray.length - 1 ? " " : ", "));
		}
		sc.close();
	}

}
