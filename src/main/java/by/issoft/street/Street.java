package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Street implements PriceCalculator{

    String name;
    List<Building> buildings;//null

    public Street(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void addBuildings(List<Building> cc){
       this.buildings = cc;
    }

    public double calculatePrice() {
        double price = 0;
        for(Building building: buildings){
            price = price + building.calculatePrice();
        }
        return price;
    }
}
