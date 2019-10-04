package homework_7_part_1;
import java.util.Scanner;

public class task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the length of the array:");
		char [] arr = new char [sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter character at position " + i);
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("Enter character:");
		char ch = sc.next().charAt(0);
		boolean hasTheSymbol = false;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(ch == arr[i]) {
				hasTheSymbol = true;
				index = i;
				break;
			} 
		}
		if(hasTheSymbol) {
			System.out.println("The symbol is at: " + index);
		} else {
			System.out.println("The symbol is not found.");
		}
		sc.close();
	}

}
