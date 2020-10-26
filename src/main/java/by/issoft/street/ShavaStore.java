package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ShavaStore implements Building {
    @Override
    public double calculatePrice() {
        return 10;
    }
}
