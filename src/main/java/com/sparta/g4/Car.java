package com.sparta.g4;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Car {

    String model;//null
    String color;//null
    int doorsСount;//0
    int fuelType;//0
    double fuelLevel;//0.0
    boolean isRoadster;//false
    FuelTankLevel fuelOnDashboard;//null

    public Car(String color, String bodyType) {
        this.color = color;
        if (bodyType.equals("sedan")) {
            this.doorsСount = 4;
        } else if (bodyType.equals("coupe")) {
            this.doorsСount = 2;
        }
this.model = bodyType;
        this.doorsСount = doorsСount;
    }

    public double drive() {
        int xxx = 10;
        System.out.println("im " + model + " (" + doorsСount + ") with color " + color + " driving to hell [" + fuelLevel + "]");
        fuelLevel = fuelLevel - 5 * xxx;
        double co2level = xxx * fuelLevel / 100;
        return co2level;
    }

    public void doWithList(List<String> pass){
        pass.add("vajas");
    }

    public static void main(String[] args) {
        Car my = new Car("polo", "white");
        if (my == null) {
            System.out.println("alarm");
        }
        //xxx.yyy.zzz.Car my = new xxx.yyy.zzz.Car("red", 3);
        // my.color = "baklazhan";
        my.fuelLevel = 709;
        my.fuelOnDashboard = FuelTankLevel.FULL;

        double totalCo2 = 0;

        totalCo2 = totalCo2 + my.drive();
        my.fullTank(10);
        totalCo2 = totalCo2 + my.drive();
        my.fullTank(10);
        totalCo2 = totalCo2 + my.drive();
        my.fullTank(10);

        System.out.println("Total CO2 " + totalCo2);

        int x = 10;

        String myOrder = my.orderInMacDak("cheese", 1, false);//cheeseburger
        System.out.println("i get my " + myOrder);
    }

    public String orderInMacDak(String model, int quantity, boolean withIce) {
        //dfsdg
        this.model = model;
        String returnProduct = "cheeseburger";
        return returnProduct;
    }


    public void fullTank(double liters) {
        fuelLevel = fuelLevel + liters;
    }


}
