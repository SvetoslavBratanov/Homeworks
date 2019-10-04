package homework_7_part_2;

public class task_22 {

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
		int [][] sumOfMatrix = new int [matrix1.length][matrix1.length];
		for(int i = 0; i < sumOfMatrix.length; i++) {
			for(int j = 0; j < sumOfMatrix[i].length; j++) {
				sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("Sum of both matrix = ");
		for(int i = 0; i < sumOfMatrix.length; i++) {
			for(int j = 0; j < sumOfMatrix[i].length; j++) {
				System.out.print(sumOfMatrix[i][j] +(j == sumOfMatrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
	}

}
