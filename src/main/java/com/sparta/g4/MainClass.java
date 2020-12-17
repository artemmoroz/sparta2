package com.sparta.g4;


public class MainClass {

    public static void main(String[] args) {
        Modificators m = new Modificators();
        m.drive();
        //m.x = 150;
        m.setX(150);
        //System.out.println(m.x);
        System.out.println(m.getX());
        //m.fuel();

    }

}
