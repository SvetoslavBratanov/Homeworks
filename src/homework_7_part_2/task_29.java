package homework_7_part_2;

public class task_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
								{1, 2, 3}, 
								{4, 5, 6},
								{7, 8, 9}
						  };
		for (int i = 0; i < matrix.length; i++) {
			int sumOfRow = 0;
			int sumOfColumn = 0;
			for (int j = 0; j < matrix[i].length; j++) {	
				//System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? " " : ", "));
				sumOfRow += matrix[i][j];
				sumOfColumn += matrix[j][i];
			}
			System.out.print("Sum of row " + (i+1) + " = " + sumOfRow);
			System.out.println("\tSum of column " + (i+1) + " = " + sumOfColumn);
		}
	}	

}
