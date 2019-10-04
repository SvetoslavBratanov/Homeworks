package homework_7_part_1;

public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 3, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		int count = 0;
		int maxCount = 0;
		int num = 0;
		int popularNum = 0;

	    for (int i = 0; i < arr.length - 1; i++) {
	        num = arr[i];
	        count = 1;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (num == arr[j]) {
	            	count++;
	            }
	        }

	        if (count > maxCount) {
	        		popularNum = num;
	                maxCount = count;
	        }
	    }
		System.out.println(popularNum + " (" + maxCount + " times)");
	}
}
