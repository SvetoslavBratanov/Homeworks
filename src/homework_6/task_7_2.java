package homework_6;

public class task_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array2d = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
			  };
		int sum = 0;
		int sumOfRow = 0;
		int i = 0;
		int j = 0;
		while(i < array2d.length) {
			if((i+j) % 2 == 0) {
				sum += array2d[i][j];
				System.out.print(array2d[i][j] + "; ");
				sumOfRow += array2d[i][j];
			}
			j++;
			if ( j == array2d[i].length ) {
				i++;
				System.out.println("Sum of elements for the current row is: " + sumOfRow);
				j = 0;
			}

		}
		System.out.println();
		System.out.println("Sum of all elements is: " + sum);
	}

}
