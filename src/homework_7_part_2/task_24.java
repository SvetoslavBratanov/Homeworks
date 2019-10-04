package homework_7_part_2;

public class task_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrixA = { 
					{1, 2, 3}, 
					{4, 5, 6},
					{7, 8, 9}
			};
		System.out.println("A = ");
		for(int i = 0; i < matrixA.length; i++) {
			for(int j = 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] +(j == matrixA[i].length - 1 ? " " : ", "));
			}
			System.out.println();		
		}
		int [][] doublingValuesOfMatrix = new int [matrixA.length][matrixA[0].length];
		for(int i = 0; i < doublingValuesOfMatrix.length; i++) {
			for(int j = 0; j < doublingValuesOfMatrix[i].length; j++) {
				doublingValuesOfMatrix[i][j] = matrixA[i][j] * 2;
			}
		}
		System.out.println("\n2 x A = ");
		for(int i = 0; i < doublingValuesOfMatrix.length; i++) {
			for(int j = 0; j < doublingValuesOfMatrix[i].length; j++) {
				System.out.print(doublingValuesOfMatrix[i][j] +(j == doublingValuesOfMatrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();		
			
		}
	}

}
