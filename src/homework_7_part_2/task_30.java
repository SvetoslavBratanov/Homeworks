package homework_7_part_2;

public class task_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
								{1, 2, 3, 45}, 
								{4, 5, 6, 78},
								{7, 8, 9, 54},
								{13,23,32, 99}
						   	};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) {
			int temp = matrix[i][i];
			matrix[i][i] = matrix[i][matrix.length - 1 - i];
			matrix[i][matrix.length - 1 - i] = temp;
		}
		System.out.println("\nMatrix after interchanging its diagonal:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
	}

}
