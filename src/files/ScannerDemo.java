package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File kniga = new File("kniga.txt");
		Scanner sc = new Scanner(kniga);
		while (sc.hasNextLine()) {
			//sc.nextLine();
			System.out.println(sc.nextLine());
		}
		
		System.out.println("Dyljina " + kniga.length());
		
		Scanner sc1 = new Scanner(kniga);
		int count = 0;
		while (sc1.hasNextLine()) {
			String s = sc1.nextLine();
			for ( char c : s.toCharArray()) {
				if ( c == '-') {
					count++;
				}
				
			}
			System.out.println(s);
		}
		
		System.out.println("Commas are: " + count);

	}

}
