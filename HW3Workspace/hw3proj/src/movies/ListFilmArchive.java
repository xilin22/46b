package movies;

import java.util.ArrayList;
import java.util.TreeSet;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive{
	
	
/**
 * this overides the the add method in ArrayList and only add
 * new movies that are not deep equal to the movies present in
 * the arraylist
 */
	public boolean add(Movie newMovie) { 
		for(int i = 0; i < size(); i++)
		{
			if(newMovie.equals(this.get(i)))
				return false;
		}
		
		return super.add(newMovie);
	}
	
/**
 * this sorted the unsorted the list to a sorted arraylist
 * @return a sorted ArrayList of movies
 */
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> moviesSorter = new TreeSet<>(this);
		ArrayList<Movie> sortedMovies = new ArrayList<>(moviesSorter);
		return sortedMovies;
	}

	
/**
 * This iterated through the array and prints it out
 * @param args
 */
	public static void main(String[] args) {
		ListFilmArchive archive = new ListFilmArchive();
		for(Movie m: Movie.getTestMovies()) 
			archive.add(m);
		for(Movie m: archive)
			System.out.println(m);
		System.out.println("**************");
		for(Movie m: archive.getSorted())
			System.out.println(m);
	}
	
}
