package com.sparta.g4.street;


public class TownHouse extends House {

    public TownHouse(int number) {
        super(number);
    }

    @Override
    protected double getCoefficient() {
        return 1.1;
    }
}
