package favoriteMovies;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;

public class DemoRevival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pesho = null;
		File mavzolej = new File("naPeshoMavzoleq.txt");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(mavzolej))) {
			System.out.println("Pesho stani vednaga!");
			try {
				pesho = (Person)ois.readObject();
				System.out.println(pesho);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + pesho.getName() + ": This are my favorite movies:");
		Iterator<Movie> it = pesho.getFavoriteMovies().iterator();
		while(it.hasNext()) {
			Movie m  = it.next();
			System.out.println(m.Title);
		}
		
		
	}

}
