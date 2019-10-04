package homework_2;
import java.util.Scanner;

public class task_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter datå to test.");
		System.out.println("Enter day:");
		int day = sc.nextInt();
		System.out.println("Enter mounth:");
		int month = sc.nextInt();
		System.out.println("Enter a year:");
		int year = sc.nextInt();
		
		boolean leapYear = (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));
		boolean correctDate = true;
		
		if(day < 0 || day > 31)
		{
			correctDate = false;
		}
		else if(month < 0 || month > 12)
		{
			correctDate = false;
		}
		else if(year < 0)
		{
			correctDate = false;
		}
		else if(day == 29 && month == 2 && !leapYear)
		{
			correctDate = false;
		}
		
		if(day == 28 && month == 2)
		{
			if(leapYear)
			{
				day++;
			}
			else
			{
				day = 1;
				month++;
			}
		}
		else if(day == 29 && month == 2 && leapYear)
		{
			day = 1;
			month++;
		}
		else if(day == 30)
		{
			switch(month)
			{
			case 2:
				correctDate = false;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day++;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 1;
				month++;
				break;
			}
		}
		else if(day == 31)
		{
			if(month == 2)
			{
				correctDate = false;
			}
			
			day = 1;
			
			if(month == 12)
			{
				month = 1;
				year++;
			}
			else
			{
				month++;
			}
		}
		else
		{
			day++;
		}
		
		if(correctDate)
		{
			System.out.print("Next date is ");
			System.out.println(day + "/" + month + "/" + year );
		}
		else
		{
			System.out.println("Invalid date.");
		}
			
	}

}
