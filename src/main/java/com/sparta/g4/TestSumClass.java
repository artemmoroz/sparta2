package com.sparta.g4;

public class TestSumClass {


    public void testSum(int x, int y) {
        int res = x + y;
        if (res == 5) {
            System.out.println("ok");
        } else {
            throw new IllegalStateException("ne ok");
            //System.out.println("testSum ne ok");
        }
    }

    public static void main(String[] args) {
        TestSumClass testClass = new TestSumClass();
        //read data
        int x = 2;
        int y = 5;
        try {
            testClass.testSum(x, y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
