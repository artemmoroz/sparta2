package com.sparta.g4.street;

import java.util.ArrayList;
import java.util.List;

public class Street extends CalculatableStore implements Calculatable {

    String name;

    public Street(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}
