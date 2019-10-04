package homework_5;

public class task_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,64,72,12,4,11,3};
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			} else if(i == 2) {
				arr[i] += arr[i+1];
				arr[i+1] = arr[i] - arr[i+1];
				arr[i] -= arr[i+1];
			} else if(i == 4) {
				arr[i] = arr[i] * arr[i+1];
				arr[i+1] = arr[i] / arr[i+1];
				arr[i] /= arr[i+1];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? " " : ", "));	
		}
	}
}
