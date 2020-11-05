package com.group2.tests;


import by.issoft.Car;
import by.issoft.files.User;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyFirstTest extends BaseTest{

    public void openBrowserStep(String ss){
        //browser.open("tut.by")
    }

    @BeforeSuite
    protected void beforeClassPrecondition() {
        System.out.println("BEFORECLASS");
    }

    @BeforeMethod(firstTimeOnly = true)
    protected void beforeTestPrecondition(){
//        open("xxx");
//        $("xx").click();
        System.out.println("before");
    }

    @AfterMethod
    protected void afterTestPrecondition(){
//        open("xxx");
//        $("xx").click();
        System.out.println("after");
    }

//    @Test
//    @Parameters({"name", "age"})
    public void loginTest(String userName, int age) {
        User rr = new UsersDataManager().getValidUser();

        System.out.println("login to store with user");
        //open browser
        openBrowserStep("sad");
        //go to url
        Car car = new Car();
        car.refill();
        //fill
        //valide
        boolean loginResult = userName.equals("artem")?true:false;
        //Assert.assertTrue(loginResult, " Unable to login to store.");
        Assert.assertEquals(loginResult, true, " Unable to login to store.");
    }

    @Test(dataProvider = "dataForInput", dataProviderClass = UsersDataManager.class)
    public void validateInput(String value, boolean result) {
        try {
            System.out.println(value + " --- " + result);
//        input.setValue(value);
//        String text = input.getText();
//
            Assert.assertEquals(value, "0");
        }catch (Exception e) {
         //   sendResultsToTm4j();
            throw e;
        }

    }




}
