package homework_7_part_1;

public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,-17,2,35,65,8};
		boolean positive = true;
		for(int i = 0; i < array.length; i ++) {
			if(array[i] >= 0) {
				continue;
			} else {
				System.out.println("The array have got negative number.");
				positive = false;
				break;
			}
		}
		if(positive) {
			System.out.println("The array haven't got negative numbers.");
		}
	}

}
