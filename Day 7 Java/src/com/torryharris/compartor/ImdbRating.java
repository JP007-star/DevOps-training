package com.torryharris.compartor;

import com.torryharris.movie.Movie;

import java.util.Comparator;

public class ImdbRating implements Comparator<Movie> {
    @Override
    public int compare(Movie movie, Movie t1) {
        if (movie.imdbRating == t1.imdbRating)
        return 0;
        else if(movie.imdbRating>t1.imdbRating)
            return 1;
        else
            return -1;
    }
}
