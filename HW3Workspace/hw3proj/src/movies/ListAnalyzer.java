package movies;

public class ListAnalyzer {
	
/**
 * This iterated through the array and prints it out
 * @param args
 */
	public static void main(String[] args) 
	{
		ListFilmArchive archive = new ListFilmArchive();
		for(int i = 0; i < 10000; i++)
		{
			archive.add(new Movie("Movie" + i, 2017));
			if(i%1000 == 0)
				System.out.println(i);
		}
		System.out.println("DONE");
	}
}
