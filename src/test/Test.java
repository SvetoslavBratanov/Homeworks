package test;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 11;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(x + " ");
				x++;
			}
			x+=5;
			System.out.println();
		}
		sc.close();
	}
}
