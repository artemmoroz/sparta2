package com.sparta.g4.street;

public class City extends CalculatableStore implements Calculatable{

    String code;

    public City(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
