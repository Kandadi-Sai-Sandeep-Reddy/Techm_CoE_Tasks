package Movie_Get_By_Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {
    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
        List<Movie> matchingMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                matchingMovies.add(movie);
            }
        }
        return matchingMovies.toArray(new Movie[0]);
    }

    public static void main(String[] args) {
        // Sample input array of Movie objects
        Movie[] obj =new Movie[4];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<4;++i)
		{
			obj[i]= new Movie();
			obj[i].setMovieName(sc.nextLine());
			
			obj[i].setCompany(sc.nextLine());
			obj[i].setGenre(sc.nextLine());
			obj[i].setBudget(sc.nextInt());
			sc.nextLine();
		}
		//
        // Search genre
        String searchGenre = sc.nextLine();
        sc.close();

        // Get movies by genre
        Movie[] sciFiMovies = getMovieByGenre(obj, searchGenre);

        // Print matching movies and their budgets
        //System.out.println("Movies matching genre '" + searchGenre + "':");
        for (Movie movie : sciFiMovies) {
        	if(movie.getBudget()>80000000)
        		System.out.println("High Budget Movie");
        	else
        		System.out.println("Low Budget Movie");
        }
    }
}
