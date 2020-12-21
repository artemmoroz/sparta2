package com.sparta.g4.street;

public class MultyHouse {//extends House {

    List<House> fff;

    public MultyHouse(int number) {
        super(number);
    }

    @Override
    protected double getCoefficient() {
        return 0.7;
    }
}
