package homework_2;

import java.util.Scanner;

public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter A:");
		a = sc.nextDouble();
		System.out.println("Enter B:");
		b = sc.nextDouble();
		System.out.println("Enter C:");
		c = sc.nextDouble();
		
		if(c<a && c<b)
		{
			System.out.println("Number " + c + " is smaller than " +a+ " and 1" +b );
		}
		else if(c>a && c>b)
		{
			System.out.println("Number " + c + " is bigger than " +a+ " and " +b);
		}
		else if (c>a && c<b)
		{
			System.out.println("Number " + c + " is between " +a+ " and " +b);
		}
			
	}

}
