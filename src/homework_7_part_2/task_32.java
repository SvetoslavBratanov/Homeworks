package homework_7_part_2;

public class task_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
								{1, 0, 0, 0, 0}, 
								{4, 5, 0, 0, 0},
								{7, 8, 9, 0, 0},
								{4, 5, 4, 8, 0},
								{3, 9, 2, 5, 6}
			   			  };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
		boolean lowerTriangle = true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				if(matrix[i][j] != 0) {
					lowerTriangle = false;
					break;
				}
			}
		}
		System.out.println();
		System.out.println(lowerTriangle ? "The matrix is lower triangular." : "The matrix isn't lower triangular.");
	}

}
