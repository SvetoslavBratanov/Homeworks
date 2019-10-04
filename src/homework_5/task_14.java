package homework_5;

public class task_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= -2.99 && array[i] <= 2.99) {
				count++;
			}
		}
		
		double [] secondArr = new double [count];
		int index = 0;
			
		for(int i = 0; i < array.length; i++) {
				if(array[i] >= -2.99 && array[i] <= 2.99) {
					secondArr[index] = array[i];
					index++;
//					for(int j = secondArr.length - 1; j >= 0; j--) {
//						double temp = array[i];
//						array[i] = secondArr[j];
//						secondArr[j] = temp;
//					}
				}
		}
		
		for(int i = 0; i < secondArr.length; i++) {
			System.out.print(secondArr[i] + (i == secondArr.length - 1 ? " " : ", "));
		}	
	}
}
