package com.group2.tests;

import lombok.Data;

@Data
public class SomeClass {


    String name;
    String nam1e;

    public String method1(String x){
        System.out.println(x);
        name += x;
        return x;
    }

    public SomeClass getClas3s(){
        return new SomeClass();
    }

    public static void main(String[] args) {

    }


}
