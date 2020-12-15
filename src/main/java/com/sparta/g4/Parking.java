package com.sparta.g4;


import java.util.ArrayList;
import java.util.List;

public class Parking {


    List<ParkingPlace> parkingPlaces = new ArrayList<>();


//    List<Car> cars;//bmw--0, polo--1
//    List<String> parkingNumbers;//b12--0, a45--1
//    List<Boolean> isCarWashed;

    public void parkCar(Car car, String place){//bmw - b12
//        cars.add(car);//bmw--0
//        parkingNumbers.add(place);//b12--0
        ParkingPlace parkingPlace = new ParkingPlace();
        parkingPlace.car = car;
        parkingPlace.number = place;
//        if(car.model.equals("bmw")){
//            parkingPlace.isAbonement = true;
//        }else{
//            parkingPlace.isAbonement = false;
//        }

        parkingPlaces.add(parkingPlace);
    }

    public Car unparkCar(String place){//b12
        //element a45 -- 1
//        cars.get(1);//polo
//        ParkingPlace pplace = parkingPlaces.remove(1);
//        Car car = pplace.car;
//        return car;
        for(ParkingPlace pp: parkingPlaces){
            if(pp.number.equals(place)){
                return pp.car;
            }
        }
        return null;
    }

    public int totalOccupied(){
        return parkingPlaces.size();
    }


    public static void main(String[] args) {
        Parking parking = new Parking();

        Car car1 = new Car("blue", "bmw");

        parking.parkCar(car1, "b12");

        System.out.println("11 "+parking.totalOccupied());

        Car car2 = new Car("red", "polo");

        parking.parkCar(car2, "a7");

        System.out.println("22 " +parking.totalOccupied());

        Car returenedCar = parking.unparkCar("b12");
        System.out.println(returenedCar);

        System.out.println(parking.unparkCar("c43"));


    }

}
