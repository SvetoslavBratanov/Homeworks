package homework_2;
import java.util.Scanner;

public class task_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of 2 items from the chess board.");
		System.out.println();
		System.out.println("Enter the first coordinate of the first field:");
		int x1 = sc.nextInt();
		System.out.println("Enter the second coordinate of the first field:");
		int y1 = sc.nextInt();
		System.out.println("Enter the first coordinate of the second field:");
		int x2 = sc.nextInt();
		System.out.println("Enter the second coordinate of the second field:");
		int y2 = sc.nextInt();
		
		int sum1 = x1 + y1;
		int sum2 = x2 + y2;
		
		boolean different1 = (sum1 % 2 == 0) && (sum2 % 2 == 1);
		boolean different2 = (sum1 % 2 == 1) && (sum2 % 2 == 0);
		
		if(different1 || different2)
		{
			System.out.println("The two fields [" +x1+ ","+y1+"] and [" +x2+","+y2+"] are with different color.");
		}
		else
		{
			System.out.println("The two fields [" +x1+ ","+y1+"] and [" +x2+","+y2+"] are with the same color.");
		}
	}

}
