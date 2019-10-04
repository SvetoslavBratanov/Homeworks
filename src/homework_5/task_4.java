package homework_5;
import java.util.Scanner;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int length = sc.nextInt();
		int[] array = new int[length];
		boolean isMirror = true;
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " element:");
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < array.length/2; i++ ) {
			if(array[i] != array[array.length - 1 - i]) {
				isMirror = false;
				break;
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + (i == array.length - 1 ? " " : ", "));
		}
		System.out.println();
		System.out.print(isMirror ? "The array is mirror." : "The array isn't mirror.");
		
		sc.close();
	}

}
