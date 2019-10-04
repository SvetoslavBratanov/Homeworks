package homework_5;
import java.util.Scanner;

public class task_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int length = sc.nextInt();
		float [] array = new float[length];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " element");
			array[i] = sc.nextFloat();
		}
//		float [] array = {7.13f, 0.2f, 4.9f, -5.1f, 6.34f, 1.12f};
		float [] arrOfMaxSum = new float [3];
		 
		for(int i = 0; i < array.length; i++){
			array[i] = array[i] < 0 ? -array[i] : array[i];
	        if(arrOfMaxSum[2] < array[i])
	            arrOfMaxSum[2] = array[i];
	    }
	    for(int i = 0; i < array.length; i++){
	    	array[i] = array[i] < 0 ? -array[i] : array[i];
	        if(arrOfMaxSum[1] < array[i] && array[i] < arrOfMaxSum[2])
	            arrOfMaxSum[1] = array[i];
	    }
	    for(int i = 0; i < array.length; i++){
	    	array[i] = array[i] < 0 ? -array[i] : array[i];
	        if(arrOfMaxSum[0] < array[i] && array[i] < arrOfMaxSum[1])
	            arrOfMaxSum[0] = array[i];
	    }
		
		for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + (i == array.length - 1 ? " " : ", "));
		}
		 System.out.println();
		for(int i = 0; i < arrOfMaxSum.length; i++) {
			System.out.print(arrOfMaxSum[i] + (i == arrOfMaxSum.length - 1 ? " " : ", "));
		}
		sc.close();
	}

}
