package by.issoft.cinema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;


@Accessors(chain = true)
public class Food extends Good {

    //String taste;

    public Food(String name) {
        super(name, 1);
       // this.taste = taste;
    }

    @Override
    public double getPrice() {
        double coefficient = 1;
        switch (name) {
            case "popcorn": {
                coefficient = 1.1;
                break;
            }
            case "cola": {
                coefficient = 1.5;
                break;
            }
        }
        return price*coefficient;
    }

}
