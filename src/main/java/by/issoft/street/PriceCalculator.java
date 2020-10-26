package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public interface PriceCalculator {

    double calculatePrice();
}
