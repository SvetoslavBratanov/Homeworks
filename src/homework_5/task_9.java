package homework_5;
import java.util.Scanner;

public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int len = sc.nextInt();
		int [] arr = new int [len];
		int [] reverseArr = new int [len];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Please, enter " + i + " elemrnt:");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < reverseArr.length; i++) {
			reverseArr[i] = arr[arr.length - 1 - i];
		}
		for(int i = 0; i < reverseArr.length; i++) {
			System.out.print(reverseArr[i] + (i == reverseArr.length - 1 ? " " : ", "));
		}
		sc.close();
		
	}

}
