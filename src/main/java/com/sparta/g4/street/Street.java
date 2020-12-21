package com.sparta.g4.street;

import java.util.ArrayList;
import java.util.List;

public class Street {

    String name;
    List<House> buildings;

    public Street(String name) {
        this.name = name;
        buildings = new ArrayList<>();
    }

    public double calculateTotalTax() {
        double totalTax = 0;
        for(House b: buildings){
            totalTax += b.calculateTotalTax();
        }
        return totalTax;
    }

    public String getName() {
        return name;
    }

    public void addBuilding(House building) {
        buildings.add(building);
    }
}
