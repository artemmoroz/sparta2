package com.sparta.g4.street;

import java.util.ArrayList;
import java.util.List;

public abstract class House extends CalculatableStore implements Calculatable{

    int number;

    public House(int number) {
        this.number = number;
    }

    public double calculateTotalTax() {
        return super.calculateTotalTax() * getCoefficient();
    }

    protected abstract double getCoefficient();

}
