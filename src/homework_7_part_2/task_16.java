package homework_7_part_2;

public class task_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray = {4, 16, 7, -9, 24, 42};
		int[] secondArray = {4, 16, 7, -9, 24, 42};	
		boolean isEqual = true;
		if(firstArray.length == secondArray.length) {
			System.out.println("The arrays are with the same length.");
			for(int i = 0; i < firstArray.length; i++) {
				if(firstArray[i] != secondArray[i]) {
					isEqual = false;
					break;
				}
			}
			System.out.println(isEqual ? "Arrays are equals." : "Arrays are not equals.");
		} else {
			System.out.println("The arrays aren't with the same length.");
		}
		
		
	}

}
