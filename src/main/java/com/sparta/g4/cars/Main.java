package com.sparta.g4.cars;


import by.issoft.sparta.TruckCar;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<String, Car> parking = new HashMap<>();

        CivilCar ccar = new CivilCar(1.6, 4, 65.0, 24);
        ccar.park("Brest");
        //ccar.drive1(1 ,"xx");
        System.out.println("-----------------");

        sss(ccar);

        Truck truck = new Truck(2.0,8,10,16);
        truck.park("Paris");

        parking.put("cc", ccar);
        parking.put("truk", truck);

        sss(truck);

        System.out.println("+++++++++++++++");
        parking.get("cc")
                .park("Luban'");

    }

    public static void sss(Car car){
       car.park("dsfsdg");

       if(car instanceof CivilCar){
           CivilCar cc = (CivilCar) car;
           cc.seatsNumber = 123;
           cc.aa();
       }
    }

    public static void ddd(Car car){

    }
}
