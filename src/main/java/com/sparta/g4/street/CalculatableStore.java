package com.sparta.g4.street;

import java.util.ArrayList;
import java.util.List;

public abstract class CalculatableStore implements Calculatable{

    List<Calculatable> calculatables;

    public CalculatableStore() {
        calculatables = new ArrayList<>();
    }

    public double calculateTotalTax() {
        double totalTax = 0;
        for (Calculatable b : calculatables) {
            totalTax += b.calculateTotalTax();
        }
        return totalTax;
    }


    public void addCalculatable(Calculatable calculatable) {
        calculatables.add(calculatable);
    }

    public void addCalculatables(List<Calculatable> calculatables) {
        this.calculatables.addAll(calculatables);
    }
}
