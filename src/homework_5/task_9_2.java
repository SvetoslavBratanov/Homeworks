package homework_5;
import java.util.Scanner;

public class task_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int len = sc.nextInt();
		int [] arr = new int [len];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Please, enter " + i + " elemrnt:");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
	
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? " " : ", "));
		}
		sc.close();
	}

}

