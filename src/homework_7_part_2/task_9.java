package homework_7_part_2;

public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {41, 10, 5, 62, -15, 3, -19};
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
	
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? " " : ", "));
		}
	}

}
