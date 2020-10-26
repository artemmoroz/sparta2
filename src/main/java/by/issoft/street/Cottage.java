package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;


public class Cottage extends House{
    public Cottage(int houseNumber) {
        super(houseNumber);
    }

    public double calculatePrice() {
        return 1000;
    }
}
