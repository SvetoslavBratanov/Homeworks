package files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CompareFile {

	public static void main(String[] args) throws IOException {

		File pesho = new File("pesho.jpg");
		File gosho = new File("gosho.jpg");
		File slavi = new File("slavi.jpg");
		slavi.createNewFile();

		if ((pesho.exists() && (!pesho.isDirectory())) && (gosho.exists() && (!gosho.isDirectory()))) {
			FileInputStream peshoReader = new FileInputStream(pesho);
			FileInputStream goshoReader = new FileInputStream(gosho);
			FileOutputStream slaviWriter = new FileOutputStream(slavi);
			int c1 = peshoReader.read();
			int c2 = goshoReader.read();

			if (new Random().nextBoolean()) {
				slaviWriter.write(c1);
			} else {
				slaviWriter.write(c2);
			}
			
			boolean isEqual = true;
			while (c1 != -1 || c2 != -1) {
				
				c1 = peshoReader.read();
				c2 = goshoReader.read();
				
				if (new Random().nextBoolean()) {
					slaviWriter.write(c1);
				} else {
					slaviWriter.write(c2);
				}
			}

			System.out.println(isEqual ? "equal" : "not equal");
		}

	}

}
