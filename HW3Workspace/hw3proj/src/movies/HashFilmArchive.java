package movies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {

/**
 * this sorted the unsorted the list to a sorted arraylist
 * @return a sorted ArrayList of movies
 */
	public  ArrayList<Movie> getSorted(){
		TreeSet<Movie> moviesSorter = new TreeSet<>(this);
		ArrayList<Movie> sortedMovies = new ArrayList<>(moviesSorter);
		return sortedMovies;
	}
	
/**
 * This iterated through the array and prints it out
 * @param args
 */
	public static void main(String[] args) {
		HashFilmArchive archive = new HashFilmArchive();
		for(Movie m: Movie.getTestMovies()) 
			archive.add(m);
		for(Movie m: archive)
			System.out.println(m);
		System.out.println("**************");
		for(Movie m: archive.getSorted())
			System.out.println(m);
	}
	
}
