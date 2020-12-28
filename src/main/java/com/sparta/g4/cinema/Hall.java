package com.sparta.g4.cinema;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Hall {

    String name;
    int totalSeats;
    int occupiedSeats;

    public Hall(String name, int totalSeats) {
        this.name = name;
        this.totalSeats = totalSeats;
    }
}
