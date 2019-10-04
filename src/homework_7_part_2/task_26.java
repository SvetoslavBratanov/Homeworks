package homework_7_part_2;

public class task_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix1 = { 
								{1, 2, 3}, 
								{4, 5, 6},
								{7, 8, 9}  
							};
		int [][] matrix2 = { 
								{1, 2, 3}, 
								{4, 5, 6},
								{7, 8, 9}
							};
		boolean isEqual = true;
		if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			System.out.println("The matrices are with the same length.");
			for(int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					if(matrix1[i][j] != matrix2[i][j]) {
						isEqual = false;
						break;
					}
				}
			}
		} else {
			System.out.println("The matrices aren't with the same length.");
			isEqual = false;
		}
		
		System.out.println(isEqual ? "Both matrices are equal." : " Both matrices are't equal.");
	}

}
