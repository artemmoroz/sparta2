package com.sparta.g4.cinema.genres;


import com.sparta.g4.cinema.Movie;

public class ComedyMovie extends Movie {

    public ComedyMovie(String name) {
        super(name);
    }

    @Override
    public double getPriceCoeef() {
        return 1;
    }
}
