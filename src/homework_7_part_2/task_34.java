package homework_7_part_2;

public class task_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
								{1, 2, 3}, 
								{4, 5, 6},
								{7, 8, 9}
						   };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
		int [][] transposeMatrix = new int [matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transposeMatrix[i][j] = matrix[j][i];
			}
		}
		System.out.println("\nThen its transpose is : ");
		for (int i = 0; i < transposeMatrix.length; i++) {
			for (int j = 0; j < transposeMatrix[i].length; j++) {
				System.out.print(transposeMatrix[i][j] + (j == transposeMatrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
	}

}
