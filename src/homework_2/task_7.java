package homework_2;
import java.util.Scanner;

public class task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	int hour;
	double money;
	boolean healthy;
	
	System.out.println("Are you healthy? (True/Fasle)");
	healthy = sc.nextBoolean();
	System.out.println("How much money do you have?");
	money = sc.nextDouble();
	
	if(healthy == true)
	{
		System.out.println("You have to go to the cinema with friends. ");
	}
	else
	{
		System.out.println("You won't go out.");
	}
	
	if(money > 10)
	{
		System.out.println("You have to buy mediciness.");
	}
	else if(money == 0)
	{
		System.out.println("You have to stay at home and drink tea.");
	}
	else 
	{
		System.out.println("You have to go to coffe.");
	}
	
	}

}
