package pogrebenie;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SaintPeter {

	public static void main(String[] args) {
		File mavzolej = new File("naPeshoMavzoleq.txt");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(mavzolej))) {
			System.out.println("Pesho stani!");
			try {
				Person pesho = (Person) ois.readObject();
				System.out.println(pesho);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
