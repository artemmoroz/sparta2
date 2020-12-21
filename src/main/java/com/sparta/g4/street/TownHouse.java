package com.sparta.g4.street;


public class TownHouse extends House {

    List<House> fff;

    public TownHouse(int number) {
        super(number);
    }

    @Override
    protected double getCoefficient() {
        return 1.1;
    }
}
