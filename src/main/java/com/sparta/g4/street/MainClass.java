package com.sparta.g4.street;

public class MainClass {

    public static void main(String[] args) {
        Street street = new Street("Lenina");

        MultyHouse multyHouse = new MultyHouse(1);
        multyHouse.addFlat(new Flat(1, 2, 70));
        multyHouse.addFlat(new Flat(2, 1, 30));
        multyHouse.addFlat(new Flat(3, 6, 130));
        multyHouse.addFlat(new Flat(4, 4, 60));

        Cottage cottage = new Cottage(2);
        cottage.addFlat(new Flat(1, 4, 200));

        TownHouse townHouse = new TownHouse(3);
        townHouse.addFlat(new Flat(1, 3, 100));
        townHouse.addFlat(new Flat(2, 5, 100));

        street.addBuilding(multyHouse);
        street.addBuilding(cottage);
        street.addBuilding(townHouse);

        double totalTax = street.calculateTotalTax();
        System.out.println("Total tax from "+ street.getName() + " = "+ totalTax);
    }


}
