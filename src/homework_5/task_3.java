package homework_5;
import java.util.Scanner;

public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			if(i <= 1) {
				array[i] = number;
			} else {
				array[i] = array[i-1] + array[i-2]; 
			}
			System.out.print(array[i] + (i == array.length - 1 ? " " : ", "));
		}
		
		sc.close();
	}
}
