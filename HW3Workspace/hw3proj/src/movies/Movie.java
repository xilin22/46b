package movies;

import java.sql.Array;

public class Movie implements Comparable<Movie>{
	private String title;
	private int year;

/**
 * this create a movie object with name and year
 * @param title the title of movie
 * @param year the year of movie
 */
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

/**
 * gets the year of the movie
 * @return year of movies
 */
	public int getYear() {
		return year;
	}
	
/**
 * gets the title
 * @return the title of movies
 */
	public String getTitle() {
		return title;
	}

/**
 * compare movies to see if movies are deep equal
 * @param that the object you want to compare 
 * @return true if it's deep equal and false if it's not equal
 */
	public int compareTo(Movie that) {
		
		int titleCmp = this.title.compareTo(that.title);
		if(titleCmp !=0) 
			return titleCmp;
			
		int yearsDiff = this.getYear() - that.getYear();	
			if(yearsDiff != 0)
				return yearsDiff;
		
		return yearsDiff;
	}

/**
 * this check whether two objects is deep equal
 * @return true if they are deep equal
 */
	public boolean equals(Object x) {
		Movie that = (Movie) x;
		return this.compareTo(that)==0;
	}

/**
 * print the title of movies 
 * @return a string concatination of movie and it's year
 */
	public String toString() {
		return "Movie " + getTitle() + " " + "(" +
				getYear() + ")";
	}

/**
 * this is a list of movies to test
 * @return array consisting of movies that is created
 */
	public static Movie[] getTestMovies() { 
		// Is this the proper way to return array?
		Movie[] movies = new Movie[10];
		movies[0] = new Movie("The Thomas Crown Affair",1968);
		movies[1] = new Movie("The Thomas Crown Affair",1999);
		movies[2] = new Movie("The Martian",2015);
		movies[3] = new Movie("Bridge of Spies",2015);
		movies[4] = new Movie("Hugo",2011);
		movies[5] = new Movie("Miracle at St. Anna",2008);
		movies[6] = new Movie("Intersteller",2014);
		movies[7] = new Movie("Black Swan",2010);
		movies[8] = new Movie("Rings",2017);
		movies[9] = new Movie("I Am Legend",2007);
		
		return movies;
	}

/**
 *creates a hashcode for objects 
 *@return create a hashcode and concatination with a year
 */
	public int hashCode() {
		return title.hashCode() + year;
	}
}
