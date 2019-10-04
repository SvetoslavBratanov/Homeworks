package homework_7_part_2;

public class task_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
								{1, 2, 3}, 
								{0, 5, 6},
								{0, 0, 9}
		   				   };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
		boolean upperTriangle = true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				if(matrix[i][j] != 0) {
					upperTriangle = false;
					break;
				}
			}
		}
		System.out.println();
		System.out.println(upperTriangle ? "The matrix is upperr triangular." : "The matrix isn't upperr triangular.");
	}

}
