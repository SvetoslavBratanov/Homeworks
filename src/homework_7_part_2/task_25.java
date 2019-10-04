package homework_7_part_2;

public class task_25 {

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
		int [][] multiplyOfMatrix = new int [matrix1.length][matrix1[0].length];
		for(int i = 0; i < multiplyOfMatrix.length; i++) {
			for(int j = 0; j < multiplyOfMatrix[i].length; j++) {
				multiplyOfMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
			}
		}
		System.out.println("Product of both matrices  = ");
		for(int i = 0; i < multiplyOfMatrix.length; i++) {
			for(int j = 0; j < multiplyOfMatrix[i].length; j++) {
				System.out.print(multiplyOfMatrix[i][j] +(j == multiplyOfMatrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();		
			
		}
		
	}

}
