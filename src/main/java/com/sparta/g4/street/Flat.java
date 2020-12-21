package com.sparta.g4.street;


public class Flat {

    int number;
    int people;
    int square;

    public Flat(int number, int people, int square) {
        this.number = number;
        this.people = people;
        this.square = square;
    }

    public double calculateTotalTax() {
       return people*square*10;
    }
}
