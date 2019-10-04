package homework_2;
import java.util.Scanner;

public class task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in degrees Celsius (between -100 and 100):");
		int temperature = sc.nextInt();
		
		if(temperature < -100 || temperature > 100)
		{
			System.out.println("The entered temperature is not in the range.");
		}
		else
		{
			if(temperature <= -20)
			{
				System.out.println("Ice cold.");
			}
			else if(temperature > -20 && temperature <= 0)
			{
				System.out.println("Cold.");
			}
			else if(temperature > 0 && temperature <= 15)
			{
				System.out.println("Chill");
			}
			else if(temperature > 15 && temperature <= 25)
			{
				System.out.println("Warm.");
			}
			else
			{
				System.out.println("Hot.");
			}
		}

	}

}
