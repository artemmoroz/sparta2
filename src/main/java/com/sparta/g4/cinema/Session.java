package com.sparta.g4.cinema;

import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Session {

    Hall hall;
    String time;
    Movie movie;
    double price;

}
