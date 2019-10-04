package pogrebenie;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DaPogrebemPesho {
	
	public static void main(String[] args) {
		
		Person pesho = new Person("Pesho", 23, "piqndeto", "ginkaEN1");
		File mavzolej = new File("naPeshoMavzoleq.txt");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(mavzolej))) {
			mavzolej.createNewFile();
			oos.writeObject(pesho);
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Pogrebenieto se precaka");
		}
		
		System.out.println("Pogrebahme pesho, da pochiva mir!");
	}

}
