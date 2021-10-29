package com.torryharris.compartor;
import com.torryharris.movie.Movie;
import java.util.Comparator;
public class Title implements Comparator<Movie> {
    @Override
    public int compare(Movie movie, Movie t1) {
        return movie.getTitle().compareTo(t1.title);
    }
}
