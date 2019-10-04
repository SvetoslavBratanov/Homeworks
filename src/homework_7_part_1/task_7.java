package homework_7_part_1;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2d = {
				{1,2,3,4}, 
				{5,6,7,8}, 
				{9,10,11,12}, 
				{13,14,15,16}, 
		};
		int sumOfMultiply = 1;
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {	
				if(j < i) {
					sumOfMultiply *= array2d[i][j];					
				}
			}
		}
		System.out.println("The multiply of the elements below the main diagonal is: " + sumOfMultiply);
	}
}
