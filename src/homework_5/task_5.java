package homework_5;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i*3;
			System.out.print(arr[i] + (i == arr.length - 1 ? " " : ", "));
		}
	}

}

