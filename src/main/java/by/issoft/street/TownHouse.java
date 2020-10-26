package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

public class TownHouse extends House{

    public TownHouse(int houseNumber) {
        super(houseNumber);
    }

    public double calculatePrice() {
        double price = 0;
        for(Flat flat: flats){
            price = price + flat.calculatePrice()/100;
        }
        return price;
    }
}
