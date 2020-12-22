package com.sparta.g4.street;

import java.util.List;

public class CalculatableTax {

    public double calculateTotalTax(List<Flat> flats) {
        double totalTax = 0;
        for (Flat f : flats) {
            totalTax += f.calculateTotalTax();
        }
        return totalTax;
    }

}
