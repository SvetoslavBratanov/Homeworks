package homework_6;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2d = {
				{11,12,13,14,15,16}, 
				{21,22,23,24,25,26}, 
				{31,32,33,34,35,36}, 
				{41,42,43,44,45,46}, 
				{51,52,53,54,55,56}, 
				{61,62,63,64,65,66}
 
		};
		int sum = 0;
		for (int i = 0; i < array2d.length; i++) {
			int sumOfRow = 0;
			for (int j = 0; j < array2d[i].length; j++) {
				if((i+j) % 2 == 0) {
					sum += array2d[i][j];
					System.out.print(array2d[i][j] + "; ");
					sumOfRow += array2d[i][j];
				}
			}	
			System.out.println(" Sum of elements for the current row is: " + sumOfRow);	
		}
		System.out.println();
		System.out.println("Sum of all elements is: " + sum);
	}

}
