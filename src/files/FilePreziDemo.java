package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePreziDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("stefi");
		f.mkdir();
		String separator = File.separator;
		File f2 = new File(f.getName() + separator + "znam2");
		f2.createNewFile();
		
		InputStream ios  = new FileInputStream("stefi1.txt");
		OutputStream ous  = new FileOutputStream("stefi2.txt");
		int c = ios.read();
		while (c != -1) {
			ous.write(c);
			c = (ios.read());
		}
		
		ios.close();
		ous.close();
		
		InputStream iost = new FileInputStream("haha.txt");
		OutputStream oust = new FileOutputStream("papa.txt");
		
		c = iost.read();
		while(c != -1) {
			oust.write(c);
			c = iost.read();
		}
		
		iost.close();
		oust.close();
		
	}

}
