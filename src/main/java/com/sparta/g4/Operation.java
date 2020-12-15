package com.sparta.g4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Operation {



    public static void main(String[] args) {
        java.util.List<String> town = new java.util.ArrayList<>();

        town.add("minsk");
        town.add("minsk2");
        town.add("minsk3");
//        Car simpleCar = null;
//        Car complexCar = null;
//
//        com.sparta.g4.Car simpleCar2 =
//                new com.sparta.g4.Car("xxx", "fff");
//
//        simpleCar.getNumber();
//
//
//        town.remove(2);



        town.clear();
        town = Arrays.asList("minsk", "minsk2", "minks3");

        town.add("brest");



    }


    public static void mai33n(String[] args) {
        Car car = new Car("blue", "coupe");
        System.out.println(car);
        doSmthCar(car);
        System.out.println("Outter " + car);
    }

    public static void doSmthCar(Car car) {
        car.color = "red";
        System.out.println("Inner " + car);
    }

    public static void mainPrimitives(String[] args) {
        int x = 10;
        System.out.println("Initial " + x);
        x = doSmth(x);
        System.out.println("After smt " + x);
    }

    public static int doSmth(int x) {
        System.out.println("Getting x " + x);
        x = -100;
        System.out.println("After " + x);
        return x;
    }


    public static void mainList(String[] args) {
//        int = Integer
//        boolean = Boolean
//        double = Double
        List<String> pass = new ArrayList<>();
        pass.add("artem");
        pass.add("sergey");
        pass.add("vesta");
        pass.add("Maria");

        addNewPass(pass);

        for (int i = 0; i < pass.size(); i++) {
            String currentPass = pass.get(i);
            System.out.println("xx " + currentPass);
        }
        System.out.println("////////////");
        for (String currentPass : pass) {
            System.out.println("xx " + currentPass);
        }
    }

    public static void addNewPass(List<String> pass) {
        pass.add("vasja");
    }


    public static void mainArrays(String[] args) {
        String pass1 = "a";
        String pass2 = "p";
        String pass3 = "b";


        String[] pass = new String[6];
        pass[0] = "a";
        pass[1] = "p";
        pass[2] = "b";
        pass[3] = "a";
        pass[4] = "y";
        pass[5] = "i";

        feedAllPass(pass);
    }

    public static void feedAllPass(String[] pass) {
        for (int i = 0; i < pass.length; i++) {
            String currentPass = pass[i];
            if (currentPass.equals("a")) {
                System.out.println(i + ". feeding pass with name " + currentPass);
                System.out.println(i + ". kill pass with name " + currentPass);
            }
//            if(currentPass.length()>20){
//                i+=3;
//            }else{
//                i+=1;
//            }
        }
        System.out.println("---------------");
        for (String currentPass : pass) {
            System.out.println("feeding pass with name " + currentPass);
            System.out.println("kill pass with name " + currentPass);
        }
    }

    public static void mainDoWhile(String[] args) {
        int kg = 68;
        do {
            System.out.println("going to gym");
            kg = kg - 1;
        } while (kg > 50);
        System.out.println("Current kg " + kg);
        kg = 54;
        while (kg > 50) {
            System.out.println("1going to gym");
            kg = kg - 1;
        }
    }

    public static void mainSwitch(String[] args) {

        FuelTankLevel level = null;

        switch (level) {
            case FULL: {
                System.out.println("xxx");
                break;
            }
            case EMPTY: {
                System.out.println("yyy");
                break;
            }

        }

        String userRole = null;

        switch (userRole) {
            case "admin": {
                System.out.println("xxx");
                break;
            }
            case "user": {
                System.out.println("yyy");
                break;
            }

        }

        int y = 5;
        switch (y) {

            case 5:
            case 43: {
                System.out.println("5");
                break;
            }
            case 0: {
                System.out.println("0");
                break;
            }
            case 7: {
                System.out.println("7");
                break;
            }
            default: {
                System.out.println("---");
            }

        }
//        if (y == x || y==43) {
//            System.out.println("5");
//        } else if (y == 0) {
//            System.out.println("0");
//        } else if (y == 7) {
//            System.out.println("7");
//        } else {
//            System.out.println("---");
//        }
    }

    public static void mainIf(String[] args) {
        double x = 10;
        double y = -4;

        boolean isMale = false;

        x += isMale ? 10 : -10;
        System.out.println(x);

        if (isMale) {
            x += 10;
        } else {
            x -= 10;
        }
        System.out.println(x);

        if (y > 5) {
            System.out.println("y>5");
        } else if (y > 0) {
            System.out.println("y>0");
        } else {
            System.out.println("Result " + x / y);
        }


    }

}
