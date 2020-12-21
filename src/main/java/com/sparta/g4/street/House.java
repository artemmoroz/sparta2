package com.sparta.g4.street;

import java.util.ArrayList;
import java.util.List;

public abstract class House {

    int number;
    List<Flat> flats;


    int flatNumber;
    int people;
    int square;

    public House(int number) {
        this.number = number;
        flats = new ArrayList<>();
    }

    public void addFlat(Flat flat){
        flats.add(flat);
    }

    public double calculateTotalTax() {
        double totalTax = 0;
        for(Flat f: flats){
            totalTax += f.calculateTotalTax();
        }
        return totalTax*getCoefficient();
    }

    protected abstract double getCoefficient();
}
