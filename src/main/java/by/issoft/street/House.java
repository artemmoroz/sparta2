package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public abstract class House implements Building {

    int houseNumber;
    List<Flat> flats;

    public House(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void addFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public abstract double calculatePrice();
}
