package homework_5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class task_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		float [] array = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + (i == array.length - 1 ? " " : ", "));
		}
		for(int i = 1; i <= array.length; i++) {
			if(array[i-1] < - 0.231f) {
				array[i-1] = i*i + 41.25f;
			} else {
				array[i-1] *= i;
			}
	    }
		System.out.println();
		for(int i = 0; i < array.length; i++) {
			System.out.print(df.format(array[i]) + (i == array.length - 1 ? " " : ", "));
		}
		
		sc.close();
	}

}
