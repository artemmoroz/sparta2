package com.sparta.g4.cinema;

import bsh.util.Sessiond;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class TimeTable {

    List<Session> sessions;

    public TimeTable() {
        sessions = new ArrayList<>();
    }

    public void add(Hall hall, String time, Movie movie) {
        Session session = new Session();
        session.setHall(hall).setTime(time).setMovie(movie);
        int timeInt = Integer.parseInt(time);
        double timeCoef = 1;
        if (timeInt > 1400) {
            timeCoef = 3;
        }
        session.setPrice(movie.getNetPrice() * timeCoef * movie.getPriceCoeef());
        sessions.add(session);
    }
}
