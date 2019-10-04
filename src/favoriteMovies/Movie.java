package favoriteMovies;

import java.io.Serializable;

public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4964691667003649062L;
	String Title;
	String Year;
	String Rated;
	String Released;
	String Runtime;
	String Genre;

	@Override
	public String toString() {
		return "Movie [Title=" + Title + "\n" + "Year=" + Year + "\n" + "Rated=" + Rated + "\n" + "Released="
				+ Released + "\n" + "Runtime=" + Runtime + "\n" + "Genre=" + Genre + "]\n";
	}

}
