package com.starta.tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Listener extends TestListenerAdapter {

    @Test
    @Parameters({"a","b"})
    public void test1(int a, int b){
        Assert.assertNotEquals(a,b);
    }

    @Test(testName = "dsfdsf")
    @Parameters({"as","bs"})
    public void test2(String a, String b){
        Assert.assertEquals(a,b, " Custom message");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        if(tr.getMethod().getRealClass().getSimpleName().equals("Strore...d")){

        }else {
            tr.getName();
            tr.getEndMillis();
        }
    }
}
