package com.torryharris.driver;

import com.torryharris.compartor.Collection;
import com.torryharris.compartor.ImdbRating;
import com.torryharris.compartor.Title;
import com.torryharris.compartor.YearOfRelease;
import com.torryharris.movie.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Movie kgf=new Movie("kgf",2019,9.5f,200);
        Movie dhoom=new Movie("dhoom",2007,8.4f,100);
        Movie avenger=new Movie("avenger",2020,9.0f,400);
        Movie ca=new Movie("ca",2010,9.0f,200);
        ArrayList<Movie> iMovie=new ArrayList<>();
        iMovie.add(kgf);
        iMovie.add(dhoom);
        iMovie.add(avenger);
        iMovie.add(ca);
        Iterator<Movie> iMovieList=iMovie.iterator();
        System.out.println("Enter your choice");
        System.out.println("1.Sort by title");
        System.out.println("2.Sort by year");
        System.out.println("3.Sort by IMDB Rating");
        System.out.println("4.Sort by Box Office Collection");
        Scanner sc=new Scanner(System.in);
        int choice= sc.nextInt();
        if(choice==1) {
            Collections.sort(iMovie,new Title());
            while (iMovieList.hasNext()) {
                System.out.println(iMovieList.next().toString());
            }
        }
        else if(choice==2){
            Collections.sort(iMovie,new YearOfRelease());
            while (iMovieList.hasNext()) {
                System.out.println(iMovieList.next().toString());
            }
        }
        else if(choice==3)
        {
            Collections.sort(iMovie,new ImdbRating());
            while (iMovieList.hasNext()) {
                System.out.println(iMovieList.next().toString());
            }
        }
        else if(choice==4)
        {
            Collections.sort(iMovie,new Collection());
            while (iMovieList.hasNext()) {
                System.out.println(iMovieList.next().toString());
            }
        }
        else
        {
            while (iMovieList.hasNext()) {
                System.out.println(iMovieList.next().toString());
            }
        }




    }
}
