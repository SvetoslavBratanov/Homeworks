package homework_7_part_2;

public class task_25_3 {

	public static void main(String[] args) {
		int[][] matrix1 = {	{1, 2, 3, 5},
							{4, 5, 6, 5},
							
		};
		int[][] matrix2 = {	{9, 8},
							{6, 5},
							{3, 2},
							{1, 3}
		};
		
		multiplyMatrix(matrix1, matrix2);
		

	}

	static void multiplyMatrix(int[][] m1, int[][] m2) {
		if(m1.length != m2[0].length) {
			System.out.println("The matrices don't match!");
			return;
		}
		
		int rows = m1.length;
		int cols = m2[0].length;
		int actions = m1[0].length; // or m2.length
		
		int[][] arr = new int[rows][cols];
		int sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < actions; k++) {
					sum = sum + m1[i][k]*m2[k][j];
				}
				arr[i][j] = sum;
				sum = 0;
			}
		}
		
		for (int  i = 0 ; i < arr.length ; i++ ) {
            for (int j = 0 ; j < arr[i].length ; j++ ) {
            	System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
         }	
	}
}
