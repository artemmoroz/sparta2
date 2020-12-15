package com.sparta.g4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingMap {

    Map<String, Car> parkingPlaces = new HashMap<>();

    public void parkCar(Car car, String place){//bmw - b12
        if(parkingPlaces.containsKey(place)){
            System.out.println("place is occupied");
        }else {
            parkingPlaces.put(place, car);
        }
    }

    public Car unparkCar(String place){//b12
        return parkingPlaces.remove(place);
    }

    public int totalOccupied(){
        return parkingPlaces.size();
    }


    public static void main(String[] args) {
        ParkingMap parking = new ParkingMap();

        Car car1 = new Car("blue", "bmw");

        parking.parkCar(car1, "b12");

        System.out.println("11 "+parking.totalOccupied());

        Car car2 = new Car("red", "polo");

        parking.parkCar(car2, "b12");

        System.out.println("22 " +parking.totalOccupied());

        Car returenedCar = parking.unparkCar("b12");
        System.out.println(returenedCar);

        System.out.println(parking.unparkCar("c43"));


    }



}
