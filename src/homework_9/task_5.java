package homework_9;
import java.util.Scanner;

public class task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to test:");
		int number = sc.nextInt();
		System.out.println("Reversed number is: " + reverseNumber(number, 0));
		System.out.println(isPalindrome(number, reverseNumber(number, 0)) ? "\nThe number is palinrome." : "\nThe number isn't palindrome.");
		sc.close();
	}

	static int reverseNumber(int n, int reverse) {

        if (n != 0){
            reverse = reverse * 10 + n % 10;
        } else {
              return reverse;
        }
    return reverseNumber(n/10, reverse);
	}

	static boolean isPalindrome(int num1, int num2) {
		num1 = num1 % 10;
		num2 = num2 % 10; 
		if(num1 != num2) {
			return false;
		}
		if(num1 == 0) {
			return true;
		}
		return isPalindrome(num1 / 10, num2 / 10);
	}
}
	
