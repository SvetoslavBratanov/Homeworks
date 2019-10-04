package homework_7_part_1;
import java.util.Scanner;

public class task_11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows:");
		int row = sc.nextInt();
		System.out.println("Please enter number of columns:");
		int col = sc.nextInt();
		
		int [][] arr2d = new int [row][col];
		int num = 1;
		
		for(int i = 0; i < arr2d[0].length; i++) {
			for(int j = 0; j < arr2d.length; j++) {
				if(i % 2 == 0) {
					arr2d[j][i] = num;
				} else {
					arr2d[arr2d.length - 1 -j][i] = num;
				}
				num++;	
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
