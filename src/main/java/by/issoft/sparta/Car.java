package by.issoft.sparta;

public abstract class Car {

    protected int doors = 4;
    protected int liters;//0


    public Car(int liters){
        this.liters = liters;
    }

    public void goToCity(String city){
        printDrivingMessage(city);
        liters -= city.length();
        System.out.println("Total liters left "
                + liters+"\n");
    }


    public abstract void printDrivingMessage(String city);

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }
}
