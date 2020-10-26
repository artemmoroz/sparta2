package by.issoft.sparta;

public class TruckCar extends Car{

    private int weightCapacity;//0

    public TruckCar(int liters, int weightCapacity) {
        super(liters);
        this.weightCapacity = weightCapacity;
    }

    @Override
    public void printDrivingMessage(String city) {
        System.out.println("im going truck "+ city+
                " weightCapacity " +weightCapacity);
    }

    public void rrr(){
        //
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }
}
