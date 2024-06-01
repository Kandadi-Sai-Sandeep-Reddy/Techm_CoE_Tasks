package Movie_Get_By_Genre;

public class Movie {

	private String movieName;
	private String company;
	private String genre;
	private int budget;
	
	
	public String getMovieName() {
		return movieName;
	}

	public String getCompany() {
		return company;
	}

	public String getGenre() {
		return genre;
	}

	public int getBudget() {
		return budget;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

}
