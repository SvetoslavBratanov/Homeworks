package homework_3;
import java.util.Scanner;

public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		System.out.println("Enter B:");
		int b = sc.nextInt();
		int sum = 0;
		
		if(a > b) {
			for (int i = b; i <= a; i++) {
				if(i % 3 == 0 && i != a) {
					System.out.print("\"skip 3\", ");
					continue;
				} else if (i % 3 == 0 && i == a) {
					System.out.print("\"skip 3\" ");
					continue;
				} else if (i < a) {
					System.out.print(i*i + ", ");
				} else {
					System.out.println(i*i);
				}
				sum += i*i;
				if(sum > 200) {
					System.out.println("The sum is more than two hundred.");
					break;
				}
			}
		}
		else if(b > a) {
			for (int j = a; j <= b; j++) {
				if(j % 3 == 0 && j != b) {
					System.out.print("\"skip 3\", ");
					continue;
				} else if (j % 3 == 0 && j == b) {
					System.out.print("\"skip 3\" ");
					continue;
				} else if (j < b) {
					System.out.print(j*j + ", ");
				} else {
					System.out.println(j*j);
				}
				sum += j*j;
				if(sum > 200) {
					System.out.println("The sum is more than two hundred.");
					break;
				}
			}
		}
		
	}

}
