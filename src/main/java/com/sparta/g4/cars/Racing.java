package com.sparta.g4.cars;


public class Racing {
    double engineVolume;
    int wheelsNumber;
    double fuelValuem;
    double weight;

    public Racing(double engineVolume, int wheelsNumber, double fuelValuem, double weight) {
        this.engineVolume = engineVolume;
        this.wheelsNumber = wheelsNumber;
        this.fuelValuem = fuelValuem;
        this.weight = weight;
        System.out.println("Racing");
        System.out.println("Engine valume " + engineVolume);
        System.out.println("Wheels number " + wheelsNumber );
        System.out.println("Fuel valuem " + fuelValuem);
        System.out.println("Weight " + weight);
    }
    public void drive(String town){
        int townLength = town.length();
        System.out.println("Go to " + town);
        System.out.println("current fuel "+fuelValuem);

        System.out.println("fuel left " + fuelValuem);
    }
}
