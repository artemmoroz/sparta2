package com.sparta.g4.cars;

public abstract class Car {

    protected double engineVolume;
    protected int wheelsNumber;
    protected double fuelValuem;

    public Car(double engineVolume, int wheelsNumber, double fuelValuem) {
        this.engineVolume = engineVolume;
        this.wheelsNumber = wheelsNumber;
        this.fuelValuem = fuelValuem;
    }

    protected String getFullName(){
        return "Im "+engineVolume+"l car with "+wheelsNumber+" and "+fuelValuem;
    }

    public abstract void park(String pplace);

    public abstract void sss();

    public void sss1(){
        park("dsfsdg");
        park("dsfsdg");
        park("dsfsdg");
        park("dsfsdg");
        park("dsfsdg");
        park("dsfsdg");
    }


}
