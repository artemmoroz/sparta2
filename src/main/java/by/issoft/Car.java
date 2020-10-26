package by.issoft;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Car {

    int liters = 10;

    public void drive(String city) throws IOException, AssertionError {

//        if(city.equals("Brest")){
//            throw new AssertionError("Demo");
//        }

        if (liters < city.length()) {
            print(city, false);
        } else {
            print(city, true);
            liters -= city.length();
        }
    }

    public void refill(){
        liters = 100;
    }

    public void print(String city, boolean ok) throws IOException {
        System.out.println(
                (ok ? "Driving" : "unable to drive ") + " to " + city
        );
        if (!ok) {
            throw new IOException("No petrol");
        }
    }

    public void parkCar(){
        System.out.println("parking");
    }

    public static void main(String[] args) {
        Car car = new Car();

        try {
            car.drive("Minsk");
            car.drive("Brest");
            car.drive("Grodno");
        } catch (IOException | AssertionError e) {
            System.out.println(e.getMessage() + " : going to petrol station");
            car.refill();
            // e.printStackTrace();
        } finally {
            car.parkCar();
        }


    }
}
