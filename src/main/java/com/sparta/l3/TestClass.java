package com.sparta.l3;

import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void test1(int a, int b){
        if(a!=b){
            throw new IllegalArgumentException("aaaa test1");
        }
        System.out.println("ok1");
    }

    @Test
    public void test2(String a, String b){
        if(!a.equals(b)){
            throw new IllegalArgumentException("aaaa test2");
        }
        System.out.println("ok2");
    }

    public static void regression() {
        TestClass testClass = new TestClass();
        try {
            testClass.test1(2, 3);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            testClass.test2("a", "a");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void smoke() {
        TestClass testClass = new TestClass();
        try {
            testClass.test1(2, 3);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        smoke();
    }




}
