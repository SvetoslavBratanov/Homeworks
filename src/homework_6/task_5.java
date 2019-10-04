package homework_6;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2d = {
				{1,2,3,4}, 
				{5,6,7,8}, 
				{9,10,11,12}, 
				{13,14,15,16}, 
		};
//		int maxSumOfRow = Integer.MIN_VALUE;
//		int maxSumOfCol = Integer.MIN_VALUE;		
		int maxSumOfRow = array2d[0][0];
		int maxSumOfCol = array2d[0][0];
		int sumOfRow = 0;
		int sumOfCol = 0;
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {	
				sumOfRow += array2d[i][j];
				sumOfCol += array2d[j][i];
			}
			if(sumOfRow > maxSumOfRow) {
				maxSumOfRow = sumOfRow;
				sumOfRow = 0;
			}
			if(sumOfCol > maxSumOfCol) {
				maxSumOfCol = sumOfCol;
				sumOfCol = 0;
			}
		}
		System.out.println("The highest sum in rows is: " + maxSumOfRow);
		System.out.println("The highest sum in columns is: " + maxSumOfCol);
		if(maxSumOfRow > maxSumOfCol) {
			System.out.println("The highest sum in rows is bigger than the highest sum in columns.");
		} else if(maxSumOfCol > maxSumOfRow) {
			System.out.println("The highest sum in columns is bigger than the highest sum in rows.");
		} else {
			System.out.println("Both sum are equals.");
		}
	}

}
