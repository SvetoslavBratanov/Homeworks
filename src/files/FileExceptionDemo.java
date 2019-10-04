package files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExceptionDemo {

	public static void main(String[] args) {

		File file = new File("vajno.txt");
		FileOutputStream fos = null;
		try {
			file.createNewFile();
			fos = new FileOutputStream("vajno.txt");
			String s = "Ebasi typoto chovek";
			for (char c : s.toCharArray()) {
				fos.write(c);
			}

		} catch (IOException e) {
			System.out.println("Ebasi typoto chovek!");
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}

	}

}
