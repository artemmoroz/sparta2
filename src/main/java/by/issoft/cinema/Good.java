package by.issoft.cinema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@AllArgsConstructor
public abstract class Good {

    String name;
    double price;

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
