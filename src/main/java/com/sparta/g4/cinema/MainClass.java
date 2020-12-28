package com.sparta.g4.cinema;

import com.sparta.g4.cinema.genres.ActionMovie;
import com.sparta.g4.cinema.genres.ComedyMovie;
import com.sparta.g4.cinema.genres.HorrorMovie;

public class MainClass {


    public static void main(String[] args) {

        Cinema cinema = new Cinema("SilverScreen");

        TimeTable timeTable = new TimeTable();

        timeTable.add(cinema.getHall("Hall1"), "1200", new ComedyMovie("Elki"));
        timeTable.add(cinema.getHall("Hall2"), "1900", new HorrorMovie("Pila"));
        timeTable.add(cinema.getHall("Hall3"), "1900", new ActionMovie("MI7"));

        timeTable.getSessions().forEach(s-> System.out.println(s+"\n\n"));

        cinema.setTimeTable(timeTable);

        cinema.getCashier().buyTicket(2, "Elki", "1200");
        cinema.getCashier().buyTicket(3, "MI7", "1900");
        cinema.getCashier().buyTicket(5, "Pila", "1900");
        cinema.getCashier().buyTicket(4, "Elki", "1200");
        cinema.getCashier().buyTicket(1, "MI7", "1900");

        cinema.getCashier().printCashReport();

    }

}
