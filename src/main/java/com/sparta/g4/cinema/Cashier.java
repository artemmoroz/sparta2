package com.sparta.g4.cinema;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Cashier {

    TimeTable timeTable;

    Map<String, Double> money = new HashMap<>();


    public void buyTicket(int count, String movieName, String time) {
        //get session
        Session selectedSession = null;
        for (Session session : timeTable.getSessions()) {
            if (session.getMovie().getName().equals(movieName)
                    && session.getTime().equals(time)) {
                selectedSession = session;
                break;
            }
        }

        //check spare hall seats
        Hall hall = selectedSession.getHall();
        int spare = hall.getTotalSeats() - hall.getOccupiedSeats();
        //if ok - decrease number
        if (spare < count) {
            System.out.println("No spare seats for "+movieName + ":  count " + count);
        } else {
            hall.setOccupiedSeats(hall.getOccupiedSeats() + count);
        }
        //count*price
        double totalPrice = count * selectedSession.getPrice();

        String genre = selectedSession.getMovie().getClass().getSimpleName();
        Double genreMoney = money.get(genre);
        if (genreMoney == null) {
            genreMoney = 0d;
        }
        genreMoney += totalPrice;
        money.put(genre, genreMoney);
    }

    public void printCashReport() {
        System.out.println(money);
    }
}
