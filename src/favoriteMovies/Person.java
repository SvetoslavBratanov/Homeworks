package favoriteMovies;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3727376854975435357L;
	
	private String name;
	private int age;
	private List<Movie> favoriteMovies;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.favoriteMovies = new ArrayList<Movie>();
	}


	public List<Movie> getFavoriteMovies() {
		return favoriteMovies;
	}


	public void setFavoriteMovies(List<Movie> favoriteMovies) {
		this.favoriteMovies = favoriteMovies;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	  void readFromDir() {
		File dir = new File(getClass().getClassLoader().getResource("resources").getPath());
		File[] fileArr = dir.listFiles();
		List<Movie> readedMovies = new ArrayList<Movie>();
		for(int i = 0; i<fileArr.length; i++) {
			try(Scanner sc = new Scanner(fileArr[i])) {
				StringBuilder builder = new StringBuilder();
				while (sc.hasNextLine()) {
					String s = sc.nextLine();
					builder.append(s);	
				}
				Gson gson = new Gson();
				Movie movie = gson.fromJson(builder.toString(), Movie.class);
				printMovie(movie);
				readedMovies.add(movie);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		chooseFavoriteMoviesFromList(readedMovies);
		
	}
	void printMovie(Movie movie) {
		System.out.println(movie);
	}
	void chooseFavoriteMoviesFromList(List<Movie> list) {	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please select a favorite movie name from the catalog:");
			String s = sc.nextLine();
			Iterator<Movie> it = list.iterator();
			while(it.hasNext()) {
				Movie temp = it.next();
				if(temp != null ) {
					if(s.equalsIgnoreCase(temp.Title)) {
						this.favoriteMovies.add(temp);
					} 
				}		
			}			
			System.out.println("Do you want more? Yes/No");
			String choice = sc.nextLine();
			if(choice != null && !choice.isEmpty()) {
				if(!choice.equalsIgnoreCase("Yes")) {
					break;
				}
			}	 	
			
		}		
		sc.close();
	}
	
}
