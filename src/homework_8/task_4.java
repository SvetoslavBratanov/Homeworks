package homework_8;

import java.util.Scanner;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three names for two people separated by a comma:");
		String twoNames = sc.nextLine();
		String [] names = twoNames.split(", ");
		String name1 = names[0];
		String name2 = names[1];
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < name1.length(); i++) {
			if(name1.charAt(i) != ' ') {
				sum1 += name1.codePointAt(i);
			}
		}
		//System.out.println(sum1);
		for(int i = 0; i < name2.length(); i++) {
			if(name2.charAt(i) != ' ') {
				sum2 += name2.codePointAt(i);
			}
		}
		//System.out.println(sum2);
		System.out.println(sum1 > sum2 ? name1 : name2);
		
		
		
		/* The second way ->
		System.out.println("Enter three names for two people separated by a comma:");
		String names = sc.nextLine();
		int i = 0;
		StringBuilder name1 = new StringBuilder("");
		StringBuilder name2 = new StringBuilder("");
		int sum1 = 0;
		int sum2 = 0;
		while(names.charAt(i) != ',') {
			if (names.charAt(i) != ' ') {
			sum1 = sum1 + names.codePointAt(i);
			}
			name1.append(names.charAt(i));
			i++;
		}
		i++;
		String lastName1 = name1.toString();
		while(i < names.length()) {
			if (names.charAt(i) != ' ') {
			sum2 = sum2 + names.codePointAt(i);
			}
			name2.append(names.charAt(i));
			i++;
		}
		String lastName2 = name2.toString();
		System.out.println(sum1 > sum2 ? lastName1 : lastName2); */
		
		sc.close();

		
	}


}
