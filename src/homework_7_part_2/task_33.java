package homework_7_part_2;

public class task_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
								{1, 2, 3}, 
								{0, 5, 6},
								{0, 0, 9}
			   			   };
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		System.out.println("Sum of upper triangular matrix = " + sum);
	}

}
