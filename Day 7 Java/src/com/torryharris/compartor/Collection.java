package com.torryharris.compartor;

import com.torryharris.movie.Movie;

import java.util.Comparator;

public class Collection implements Comparator<Movie> {
    @Override
    public int compare(Movie movie, Movie t1) {
        if (movie.collection == t1.collection)
            return 0;
        else if(movie.collection>t1.collection)
            return 1;
        else
            return -1;
    }
}
