package homework_6;
import java.util.Scanner;

public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of matrix:");
		int size = sc.nextInt();
		int [][] array2d = new int [size][size];
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
				System.out.println("Enter value of row " + i + " and collon "+ j);
				array2d[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < array2d.length; i++) {
			System.out.print(array2d[i][i] + (i == array2d.length - 1 ? " " : ", "));	
		}
		System.out.println();
		for(int i = 0; i < array2d.length; i++) {
			System.out.print(array2d[i][array2d[i].length - 1 - i] + (i == array2d[i].length - 1 ? " " : ", "));
		}
		sc.close();
	}
}
