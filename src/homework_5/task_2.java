package homework_5;
import java.util.Scanner;

public class task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int length = sc.nextInt();
		int [] array = new int[length];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Please, enter " + i + " element");
			array[i] = sc.nextInt();
		}
		int [] secondArr = new int[array.length];
		
		for(int i = 0; i < array.length/2; i++) {
			secondArr[i] = array[i];
		}
		int resultIndex = array.length / 2;
		for(int i = array.length - 1; i >= array.length / 2; i--) {
			secondArr[resultIndex] = array[i];
			resultIndex++;
		}
		
		
		System.out.println("New array is:");
		for(int i = 0; i < secondArr.length; i++) {
			if(i != secondArr.length - 1){
				System.out.print(secondArr[i] + ", ");
			}else {
				System.out.print(secondArr[i]);
			}
		}
		
		sc.close();
	}

}
