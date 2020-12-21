package com.sparta.g4.street;


public class Cottage extends House {

    public Cottage(int number) {
        super(number);
    }

    @Override
    protected double getCoefficient() {
        return 1.4;
    }
}
