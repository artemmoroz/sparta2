package com.sparta.g4.street;

public class MainClass {

    public static void main(String[] args) {

        City minsk = new City("017");

        Street street = new Street("Lenina");

        CalculatableStore multyHouse = new MultyHouse(1, "A++");
        multyHouse.addCalculatable(new Flat(1, 2, 70));
        multyHouse.addCalculatable(new Flat(2, 1, 30));
        multyHouse.addCalculatable(new Flat(3, 6, 130));
        multyHouse.addCalculatable(new Flat(4, 4, 60));

       // Calculatable f = new Flat(1,22,4);

//        multyHouse.addFlats(new ProjectB().getFlats());
//
//        multyHouse.initFromProject(new ProjectA());
       // House multyHouse2 = new MultyHouse(4, "A++", new ProjectA());

        House cottage = new Cottage(2);
        cottage.addCalculatable(new Flat(1, 4, 200));

        House townHouse = new TownHouse(3);
        townHouse.addCalculatable(new Flat(1, 3, 100));
        townHouse.addCalculatable(new Flat(2, 5, 100));

        street.addCalculatable(multyHouse);
       // street.addBuilding(multyHouse2);
        street.addCalculatable(cottage);
        street.addCalculatable(townHouse);

        double totalTax = street.calculateTotalTax();
        System.out.println("Total tax from "+ street.getName() + " = "+ totalTax);

        minsk.addCalculatable(street);

        Street street2 = new Street("Pushkina");

        CalculatableStore multyHouse2 = new MultyHouse(1, "A++");
        multyHouse2.addCalculatable(new Flat(1, 2, 70));
        multyHouse2.addCalculatable(new Flat(2, 1, 30));
        multyHouse2.addCalculatable(new Flat(3, 6, 130));
        multyHouse2.addCalculatable(new Flat(4, 4, 60));

        street2.addCalculatable(multyHouse2);

        street2.addCalculatable(new Bakery());

        minsk.addCalculatable(street2);

        double totalTax2 = minsk.calculateTotalTax();
        System.out.println("Total tax from "+ minsk.getCode() + " = "+ totalTax2);

    }


}
