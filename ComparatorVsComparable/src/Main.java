import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for(Movie movie: list) {
        	System.out.println(movie);
        }
        
        System.out.println("\nSorted by rating");
        RatingClass rating = new RatingClass();
        Collections.sort(list, rating);
        for(Movie movie: list) {
        	System.out.println(movie);
        }
        
        System.out.println("\nSorted by name");
        MovieName name = new MovieName();
        Collections.sort(list, name);
        for(Movie movie: list) {
        	System.out.println(movie);
        }
	}
}
