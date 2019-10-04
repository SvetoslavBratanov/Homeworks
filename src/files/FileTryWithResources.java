package files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTryWithResources {

	public static void main(String[] args) {
		File file = new File("mnogo_vajno.txt");
		try (FileOutputStream fos = new FileOutputStream(file); FileInputStream fis = new FileInputStream(file)) {
			file.createNewFile();
			String s = "Ebasi VAJNOTO chovek";
			for (char c : s.toCharArray()) {
				fos.write(c);
			}
		} catch (IOException e) {
			System.out.println("Ebati typoto chovek!");
		}

	}

}
