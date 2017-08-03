import java.util.Comparator;

public class RatingClass implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getRating() > o2.getRating()) {
			return 1;
		} else if(o1.getRating() == o2.getRating()) {
			return 0;
		}
		return -1;
	}

}
