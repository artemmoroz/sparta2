package com.sparta.g4.cinema.genres;

import com.sparta.g4.cinema.Movie;
import lombok.Data;
import lombok.experimental.Accessors;

public class HorrorMovie extends Movie {
    public HorrorMovie(String name) {
        super(name);
    }

    @Override
    public double getPriceCoeef() {
        return 1.6;
    }
}
