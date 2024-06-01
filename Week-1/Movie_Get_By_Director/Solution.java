package Movie_Get_By_Director;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie[] movies = new Movie[4];

        for (int i = 0; i < 4; i++) {
            int movieId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String director = scanner.nextLine();
            int rating = scanner.nextInt();
            int budget = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            movies[i] = new Movie(movieId, director, rating, budget);
        }

        String director = scanner.nextLine();
        int rating = scanner.nextInt();
        int budget = scanner.nextInt();
        scanner.close();

        double avgBudget = findAvgBudgetByDirector(movies, director);
        if (avgBudget > 0) {
            System.out.println((int)avgBudget);
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Movie movie = getMovieByRatingBudget(movies, rating, budget);
        if (movie != null) {
            System.out.println( movie.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
    }

    public static double findAvgBudgetByDirector(Movie[] movies, String director) {
        int sum = 0;
        int count = 0;

        for (Movie movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                sum += movie.getBudget();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }

    public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget) {
        for (Movie movie : movies) {
            if (movie.getRating() == rating && movie.getBudget() == budget) {
                if (budget % rating == 0) {
                    return movie;
                }
            }
        }
        return null;
    }
}

