package homework_7_part_2;

public class task_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
								{1, 0, 0}, 
								{0, 1, 0},
								{0, 0, 1}
						  };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? " " : ", "));
			}
			System.out.println();
		}
		boolean isIdentity = true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i == j && matrix[i][j] != 1) {
					isIdentity = false;
					break;
				} else if(i != j && matrix[i][j] != 0) {
					isIdentity = false;
					break;
				}
			}
		}
		System.out.println();
		System.out.println(isIdentity ? "It is identity matrix." : "It isn't identity matrix.");
		
	}

}
