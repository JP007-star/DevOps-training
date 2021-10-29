package com.torryharris.movie;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {
    public String title;
    public int year;
    public float imdbRating;
    public float collection;

    public Movie(String title, int year, float imdbRating, float collection) {
        this.title = title;
        this.year = year;
        this.imdbRating = imdbRating;
        this.collection = collection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public float getCollection() {
        return collection;
    }

    public void setCollection(float collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdbRating=" + imdbRating +
                ", collection=" + collection +
                '}';
    }




    @Override
    public int compareTo(Movie movie) {
        return 0;
    }
}
