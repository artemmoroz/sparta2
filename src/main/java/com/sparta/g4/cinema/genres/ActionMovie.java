package com.sparta.g4.cinema.genres;

import com.sparta.g4.cinema.Movie;
import lombok.Data;
import lombok.experimental.Accessors;

public class ActionMovie extends Movie {
    public ActionMovie(String name) {
        super(name);
    }

    @Override
    public double getPriceCoeef() {
        return 1.4;
    }
}
