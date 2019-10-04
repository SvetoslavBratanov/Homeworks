package homework_6;

public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2d = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
		};
		int min = array2d[0][0];
		int max = array2d[0][0];
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
				if(array2d[i][j] > max) {
					max = array2d[i][j];
				} 
				if(array2d[i][j] < min) {
					min = array2d[i][j];
				}
			}
		}
		System.out.println("The biggest number is: " + max);
		System.out.println("The smallest number is: " + min);
	}

}
