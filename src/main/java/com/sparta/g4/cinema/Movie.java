package com.sparta.g4.cinema;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public abstract class Movie {

    String name;
    double netPrice = 10;
    String genre;

    public Movie(String name) {
        this.name = name;
    }

    public abstract double getPriceCoeef();
}
