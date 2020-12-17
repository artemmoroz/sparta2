package com.sparta.g4;


public class Modificators {

    private int x;
    protected int tankCapacity;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void drive(){
        System.out.println("drinving");
        x -= 1;
    }

    public void fuel(){
        if(x+10>tankCapacity){
            x = tankCapacity;
        }else{
            x+=10;
        }
    }

}
