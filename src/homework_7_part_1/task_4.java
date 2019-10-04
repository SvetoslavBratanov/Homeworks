package homework_7_part_1;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,0,1,1,0,0,1,0,0,1,0,0,0,1};
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				counter ++;
			} 
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i < counter) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? " " : ", "));
		}
	}

}
