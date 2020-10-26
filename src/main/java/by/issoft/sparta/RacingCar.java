package by.issoft.sparta;


public class RacingCar extends Car{

    private int speed;

    public RacingCar(int liters, int speed) {
        super(liters);
        this.speed = speed;
    }


    @Override
    public void printDrivingMessage(String city) {
        System.out.println("im rracing going "+ city+ " speed " +speed);
    }


    public int getLiters(){
        return liters+20;
    }
}
