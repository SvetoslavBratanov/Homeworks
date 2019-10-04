package homework_6;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2d = {
				{1,2,3,4}, 
				{5,6,7,8}, 
				{9,10,11,12}, 
				{13,14,15,16}, 
		};
		int [][] temp = new int[array2d.length][array2d[0].length];
//		for (int i = 0; i < array2d.length; i++) {
//			for (int j = array2d[i].length - 1 ; j >= 0; j--) {
//				System.out.print(array2d[j][i] + (j == 0 ? " " : ", "));
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < temp.length; i++) {
//			for (int j = 0; j < temp[i].length; j++) {
//				temp[i][j] = array2d[array2d[i].length - 1 - j][i];
//			}	
//		}
//		System.out.println();
//		for (int i = 0; i < temp.length; i++) {
//			for (int j = 0; j < temp[i].length; j++) {
//				System.out.print(temp[i][j] + (j == temp[i].length - 1 ? " " : ", "));
//			}	
//			System.out.println();
//		}
		
		for (int i = 0; i < array2d.length; i++) {
			for (int j = array2d.length - 1; j >= 0; j--) {
				System.out.print(array2d[j][i] + " ");
			}
			System.out.println();
		}
		
	}
}
