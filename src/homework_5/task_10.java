package homework_5;
import java.util.Scanner;

public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = new int [7];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " elemrnt:");
			array[i] = sc.nextInt();
		}
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum / array.length;
		
		System.out.println("Average is: " + average);
		
		//double minDistance = Math.abs(array[0] - average);
		double minDistance = (array[0] - average) < 0 ? -(array[0] - average) : (array[0] - average);
		int nearestNumber = 0;
		
		for(int i = 0; i < array.length; i++) {
			double distance = Math.abs(array[i] - average);
			if(distance < minDistance) {
				nearestNumber = i;
				minDistance = distance;
			}

		}
		System.out.println("Nearest number is: " + array[nearestNumber]);
		sc.close();
	}	

}
