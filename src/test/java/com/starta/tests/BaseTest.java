package com.starta.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest{

    public static final long timeOut = 4;


    public static void main(String[] args) {
        String url1 = "http://artem:12345.stack.com";
        String artem = "artem";
        String url0 = "http://"+artem+":12345.stack.com";

        String url = "http://%s:%d.stack.com";
        url = String.format(url, artem, 12345);
        System.out.println(url0);
        System.out.println(url);

    }


    //@Test(dataProvider = "emailProvider", dataProviderClass = DP.class)
    @Test(dataProvider = "emailProvider", dataProviderClass = DP.class)
    public void test1(String email, String fio) {



        System.out.println(email+"--"+fio);
        String hint1 = "1";


        String hint2 = "2";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(hint1, "32");
        System.out.println("Hello");
        softAssert.assertEquals(hint2, "33");
        softAssert.assertAll();
    }

}
