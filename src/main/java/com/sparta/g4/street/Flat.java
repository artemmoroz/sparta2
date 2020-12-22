package com.sparta.g4.street;

import lombok.*;

@AllArgsConstructor
@Data
public class Flat implements Calculatable{
//dsfs
    private int number;
    private int people;
    private int square;

    public double calculateTotalTax() {
        return people*square*10;
    }

    public static void main(String[] args) {
        Flat f = new Flat(1,2,3);
        System.out.println(f.getNumber());
        System.out.println(f);
    }





}
