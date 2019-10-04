package homework_7_part_1;

public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{1,2,3,4}, 
				{50,61,77,8}, 
				{9,110,38,12}, 
				{89,44,12,23}, 
		};
		int sum = 0;
		int maxSum = 0;
		int indexRow = 0;
		int indexCol = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length - 1; j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];
				if(maxSum < sum) {
					maxSum = sum;
					indexRow = i;
					indexCol = j;
				}
			}
		}
		System.out.println(arr[indexRow][indexCol] + ", " + arr[indexRow][indexCol + 1]);
		System.out.println(arr[indexRow + 1][indexCol] + ", " + arr[indexRow + 1][indexCol + 1]);
	}

}
