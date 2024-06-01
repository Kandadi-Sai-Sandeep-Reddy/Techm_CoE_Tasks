package Movie_Get_By_Director;

class Movie {
    // Attributes
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    // Constructor
    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    // Getters
    public int getMovieId() {
        return movieId;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public int getBudget() {
        return budget;
    }

    // Setters
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}