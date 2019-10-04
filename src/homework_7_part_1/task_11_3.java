package homework_7_part_1;
import java.util.Scanner;

public class task_11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows:");
		int row = sc.nextInt();
		System.out.println("Please enter number of columns:");
		int col = sc.nextInt();
		
		int [][] arr2d = new int [row][col];
		int count = 1;
		for(int i = 0; i < row + col; i++) {
			for(int j = 0; j < col; j++) {
				if(i - j >= 0 && i - j < row) {
					System.out.println(i - j + ":  i - j");
					
					arr2d[i - j][j] = count;
					count++;
				}
				
			}
			
		}
		
		for(int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[i].length; j++) {
			System.out.print(arr2d[i][j] + (arr2d[i][j] == arr2d[i][arr2d[i].length - 1] ? " " : ",") + "\t");	
			}
			System.out.println();
		}
		sc.close();
		
	}

}
