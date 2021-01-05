package com.sparta.g4;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumClassTest2 {

    @Test
    @Parameters({"login", "pass"})
    public void testMinus(int xtttt, int y) {
        int res = xtttt-y;
        Assert.assertEquals(res, 5, "minus operation not working correct");

    }

    @Test
    @Parameters({"size"})
    public void testMinus2(int xtttt) {
        int res = xtttt;
        Assert.assertEquals(res, 5, "minus operation not working correct");

    }


}