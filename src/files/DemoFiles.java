package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class DemoFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("stefi.txt");
		File file1 = new File("stefi1.txt");
		File file2 = new File("src");
		
		if ( file.exists()) {
			file.delete();
		} else {
			file.createNewFile();
		}
		
		if ( file1.exists()) {
			System.out.println("Namerih fajla");
		}
		
		if ( file2.exists() && file2.isDirectory()) {

			System.out.println("Namerih SRC_to");
		}
		
		File [] files = file2.listFiles();
		for ( File f : files) {
			System.out.println(f.getName());
			if ( f.isDirectory() ) {
				File [] insideFiles = f.listFiles();
				for (File fi : insideFiles) {
					System.err.println(fi.getName());					
					InputStream stream = new FileInputStream(fi);
					Scanner sc = new Scanner(stream);
					while(sc.hasNextLine()) {
						System.out.println(sc.nextLine());
					}
					stream.close();
					sc.close();
				}
			}
			
		}
		
		
		
	}

}
