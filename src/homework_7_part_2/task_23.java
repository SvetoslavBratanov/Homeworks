package homework_7_part_2;

public class task_23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix1 = { 
		  						{1, 2, 3}, 
		  						{4, 5, 6},
		  						{7, 8, 9}
							};
		int [][] matrix2 = { 
								{9, 8, 7}, 
								{6, 5, 4},
								{3, 2, 1}
		   					};
		int [][] differenceOfMatrix = new int [matrix1.length][matrix1.length];
		for(int i = 0; i < differenceOfMatrix.length; i++) {
			for(int j = 0; j < differenceOfMatrix[i].length; j++) {
				differenceOfMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		System.out.println("Difference of both matrices = ");
		for(int i = 0; i < differenceOfMatrix.length; i++) {
			for(int j = 0; j < differenceOfMatrix[i].length; j++) {
				System.out.print(differenceOfMatrix[i][j] +(j == differenceOfMatrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();		
			
		}
	}
}
