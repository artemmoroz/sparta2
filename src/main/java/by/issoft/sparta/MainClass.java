package by.issoft.sparta;


public class MainClass {

    public static void main(String[] args) {


        TruckCar truckCar = new TruckCar(234,
                545);
        truckCar.goToCity("Minsk");

        RacingCar racingCar = new RacingCar(50,
                200);
        racingCar.goToCity("Gomel");



    }

}
