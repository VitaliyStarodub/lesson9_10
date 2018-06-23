package java_oop.lesson9_10.movieYearFinder;

import java.util.Objects;

public class Movie {
    private final String name;
    private final int releaseYear;
    private final Genre genre;

    public Movie(String name, int releaseYear, Genre genre) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear &&
                Objects.equals(name, movie.name) &&
                genre == movie.genre;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, releaseYear, genre);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre=" + genre +
                '}';
    }
}
