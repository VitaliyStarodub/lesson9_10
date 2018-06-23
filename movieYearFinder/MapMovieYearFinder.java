package java_oop.lesson9_10.movieYearFinder;

import java.util.*;

public class MapMovieYearFinder implements MovieYearFinder {
    private final SortedMap<Integer, Movie> movies = new TreeMap<>();

    @Override
    public void add(Movie movie) {
        movies.put(movie.hashCode(), movie);
    }

    @Override
    public List<Movie> findByReleaseYear(int releaseYear) {
        List<Movie> moviesByReleaseYear = new ArrayList<>();

        for(Iterator<Map.Entry<Integer, Movie>> moviesEntry = movies.entrySet().iterator(); moviesEntry.hasNext(); ){
            Map.Entry<Integer, Movie> pair = moviesEntry.next();
            if(pair.getValue().getReleaseYear() == releaseYear){
                moviesByReleaseYear.add(pair.getValue());
                }
            }
            return moviesByReleaseYear;
    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear) {
        List<Movie> moviesByReleaseYears = new ArrayList<>();

        for(Iterator<Map.Entry<Integer, Movie>> moviesEntry = movies.entrySet().iterator(); moviesEntry.hasNext(); ) {
            Map.Entry<Integer, Movie> pair = moviesEntry.next();
            if(pair.getValue().getReleaseYear() >= minReleaseYear && pair.getValue().getReleaseYear() <= maxReleaseYear){
                moviesByReleaseYears.add(pair.getValue());
            }
        }
        return moviesByReleaseYears;
    }

    @Override
    public String toString() {
        return "MapMovieYearFinder{" +
                "movies=" + movies +
                '}';
    }
}
