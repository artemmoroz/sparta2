package com.sparta.g4.cars;

public class CivilCar extends Car {

    protected int seatsNumber;

    public CivilCar(double engineVolume, int wheelsNumber, double fuelValuem, int seatsNumber) {
        ///
        super(engineVolume, wheelsNumber, fuelValuem);
        this.seatsNumber = seatsNumber;
    }

    @Override
    protected String getFullName() {
//        int x = 0;
//        return super.getFullName() + " with seats count " + seatsNumber;
        return "xxxx";
    }

    @Override
    public void park(String pplace) {
        seatsNumber = 1;
        System.out.println(getFullName() + " forward parking " + pplace);
    }

    @Override
    public void sss() {
        park("dsfsdg");
        park("dsfsdg");
        park("dsfsdg");
        park("dsfsdg");
        park("dsfsdg");
        aa();
    }

    @Override
    public void sss1() {
        super.sss1();
        aa();
    }

    public void aa(){}


}
