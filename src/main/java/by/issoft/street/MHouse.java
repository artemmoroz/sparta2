package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

public class MHouse extends House{


    public MHouse(int houseNumber) {
        super(houseNumber);
    }

    public double calculatePrice() {
        double price = 0;
        for(Flat flat: flats){
            price = price + flat.calculatePrice();
        }
        return price;
    }
}
