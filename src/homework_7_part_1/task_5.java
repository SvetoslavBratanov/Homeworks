package homework_7_part_1;
import java.util.Scanner;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row =sc.nextInt();
		System.out.println("Enter number of columns: ");
		int col =sc.nextInt();
		
		int [][] array2d = new int [row][col];
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
				System.out.println("Enter value of row " + i + " and columns "+ j);
				array2d[i][j] = sc.nextInt();
			}
		}
		int rowOfMax = 0;
		int maxSum = 0;
		for (int i = 0; i < array2d.length; i++) {
			int sumOfRow = 0;
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j] + (j == array2d[i].length - 1 ? " " : ", "));
				sumOfRow += array2d[i][j];
			}
			System.out.println(" sum = " + sumOfRow);
			if(sumOfRow > maxSum) {
				maxSum = sumOfRow;
				rowOfMax = i+1;
			}
		}
		
		System.out.println("Max sum is: " + maxSum + " at row " + rowOfMax);
		sc.close();
	}

}
