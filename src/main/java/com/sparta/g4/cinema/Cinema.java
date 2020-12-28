package com.sparta.g4.cinema;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Accessors(chain = true)
public class Cinema {

    String name;
    List<Hall> halls;
    Cashier cashier;
    TimeTable timeTable;

    public Cinema(String name) {
        this.name = name;
        this.cashier = new Cashier();
        this.halls = Arrays.asList(
          new Hall("Hall1", 10),
          new Hall("Hall2", 3),
          new Hall("Hall3", 7)
        );
    }

    public void setTimeTable(TimeTable timeTable){
        this.timeTable = timeTable;
        this.cashier.setTimeTable(timeTable);
    }



    public Hall getHall(String hallName) {
        for(Hall hall: halls){
            if(hall.getName().equals(hallName)){
                return hall;
            }
        }
        return null;
    }
}
