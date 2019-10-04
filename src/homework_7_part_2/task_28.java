package homework_7_part_2;

public class task_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { 
							{1, 2, 3}, 
							{4, -50, 6},
							{77, 8, 9}
						  };
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][matrix.length - 1 - i];
		}
		System.out.println("Sum of minor diagonal elements = " + sum);
	}

}
