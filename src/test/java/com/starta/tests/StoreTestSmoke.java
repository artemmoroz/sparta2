package com.starta.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StoreTestSmoke extends BaseTest{

    @Test
    @Parameters({"a","b"})
    public void test1(int a, int b){
        Assert.assertNotEquals(a,b);
    }


    @Test
    public void test3(){
        System.out.println(11);
    }


}
