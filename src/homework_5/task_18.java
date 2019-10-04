package homework_5;

public class task_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] firstArray = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int [] secondArray = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
		int [] thirdArray = new int [10];
		for(int i = 0; i < thirdArray.length; i++) {
			if(firstArray[i] >= secondArray[i]) {
				thirdArray[i] = firstArray[i];
			} else {
				thirdArray[i] = secondArray[i];
			}
		}
		
		
		
		for(int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + (i == firstArray.length - 1 ? " " : ", "));
		}
		System.out.println();
		for(int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + (i == secondArray.length - 1 ? " " : ", "));
		}
		System.out.println("\n");
		for(int i = 0; i < thirdArray.length; i++) {
			System.out.print(thirdArray[i] + (i == thirdArray.length - 1 ? " " : ", "));
		}
	}

}
