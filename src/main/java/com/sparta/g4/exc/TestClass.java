package com.sparta.g4.exc;


import java.rmi.AlreadyBoundException;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

    int fuelLevel = 9;

    public void drive(String... cities) throws BrestForbidenException, NotEnFuelException {
        for (String city : cities) {
            int fuelRequired = city.length();
            if(city.equals("Brest")){
                throw new BrestForbidenException("brest is forbidden");
            }
            if (fuelLevel >= fuelRequired) {
                System.out.println("going to " + city);
                fuelLevel -= fuelRequired;
            } else {
                throw new NotEnFuelException("Not enough fuel to drive to " + city);
            }
        }
    }

    public void repair(){
        System.out.println("repairing car");
    }

    public void dezinfection(){
        System.out.println("dezinfection car");
    }


    public void multiDrive() throws NotEnFuelException {
        try {
            drive("Minsk", "Brest", "Gomel");
            drive("Washington", "NYfsdfd", "Nebraska");
        } catch (BrestForbidenException e) {
            System.out.println("iiii");
            throw new IllegalArgumentException("wwww");
        }

    }

    public static void main(String[] args) throws ClassNotFoundException {
        TestClass t = new TestClass();
        try {
            t.multiDrive();
//        } catch (IllegalArgumentException e) {
//            System.out.println("XXX " + e.getMessage());
//            t.dezinfection();
        } catch (NotEnFuelException e) {
            System.out.println("stop driving " + e.getMessage());
            //code
            throw new ClassNotFoundException("cccc", e);
        }
        t.repair();

        int index = 7;
        List<String> ss = new ArrayList<>();

             if(ss.size()>=index){
                        ss.get(index);
                 }else{
                        System.out.println("ddd");
                   }
//        try {
//            processIndex(index);
//            //ss.get(index);
//        }catch (IndexOutOfBoundsException ee){
//            //one more index
//        }



    }


}
