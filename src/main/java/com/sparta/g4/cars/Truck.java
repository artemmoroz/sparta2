package com.sparta.g4.cars;

public class Truck extends Car{

    int carrying;

    public Truck(double engineVolume, int wheelsNumber, double fuelValuem, int carrying) {
        super(engineVolume, wheelsNumber, fuelValuem);
        this.carrying = carrying;
    }

    @Override
    public void park(String pplace) {
        System.out.println(getFullName() + " backward parking " + pplace);
    }

    @Override
    public void sss() {
        park("dsfsdg");
    }
}

