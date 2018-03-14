package movies;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive // Treeset alsready has add method that returns a boolean
{
/** 
 *  this sorted the unsorted the list to a sorted arraylist
 * @return a sorted ArrayList of movies
 */
	public ArrayList<Movie> getSorted(){
		ArrayList<Movie> sortedMovies =  new ArrayList<>(this);
		return sortedMovies;
	}

/**
 * This iterated through the array and prints it out
 * @param args
 */
	public static void main(String[] args) {
		TreeFilmArchive archive = new TreeFilmArchive();
		for(Movie m: Movie.getTestMovies()) 
			archive.add(m);
		for(Movie m: archive) // what is the reason for this error? 
			// do i have to cast the TreeSet into array?
			System.out.println(m);
		System.out.println("**************");
		for(Movie m: archive.getSorted())
			System.out.println(m);
	}
	
	
}
