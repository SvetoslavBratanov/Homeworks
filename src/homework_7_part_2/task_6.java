package homework_7_part_2;

public class task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {12, 45, 78, 60};
		
		int [] array2 = new int [array.length];

		for(int i = 0; i < array.length; i++) {
			array2[i] = array [i];
			System.out.print(array2[i] + (i == array.length - 1 ? " " : ", "));
		}
		System.out.println();
		
		int [] firstArray = {3, 45, 78, 80}; // 0,1,2,3,
		int [] secondArray = {10, 8, 9, 50}; // 4,5,6,7;
		
		int [] thirdArray = new int [firstArray.length + secondArray.length];
		
		for(int i = 0; i < thirdArray.length; i++) {
			if(i < firstArray.length) {
				thirdArray [i] = firstArray [i];
			} else {
				thirdArray [i] = secondArray [i - firstArray.length];
			}
			System.out.print(thirdArray[i] + (i == thirdArray.length - 1 ? " " : ", "));
		}
	}

}
