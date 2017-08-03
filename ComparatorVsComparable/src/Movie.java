
public class Movie implements Comparable<Movie>{
 
	private int year;
	private String name;
	private double rating;
	
	// Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
    
    
	@Override
	public String toString() {
		return "Movie [year=" + year + ", name=" + name + ", rating=" + rating + "]";
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}
	
	// Used to sort movies by year
	@Override
	public int compareTo(Movie obj) {
		// TODO Auto-generated method stub
		return this.year - obj.year;
	}

}
