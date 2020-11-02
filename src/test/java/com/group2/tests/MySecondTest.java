package com.group2.tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sun.jvm.hotspot.debugger.win32.coff.COFFException;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class MySecondTest extends BaseTest{

    @Test
    public void userCanLoginByUsername() {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Mojave");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "76");
        caps.setCapability("resolution", "1280x1024");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");



        Configuration.browserCapabilities = caps;

        Configuration.timeout = 9000;
        Configuration.pollingInterval = 203;


        Configuration.browser = "Filrefox";
        Configuration.browserSize = "1000/1231";


        WebDriver webDriver = WebDriverRunner.getWebDriver();


        open("https://ya.ru/");

        $(By.cssSelector("#text")).setValue("Hello sparta");

        $("dsfsdgsg").waitUntil(Condition.appear, 60000, 3000);

        $(By.xpath("//tbody/tr[2]/td[1]/form[1]/div[2]/button[1]")).click();

        $$("li.serp-item").forEach(item -> System.out.println(item.getText()));

        String countResults = $(".serp-adv__found")
                .getText();

        System.out.println(countResults);


        String coffee = "Кофе молотый «Dallmayr» classic, 250 г.";
        $(By.cssSelector("#searchtext")).setValue(coffee).pressEnter();
        $(By.xpath("//a[contains(text(),'" + coffee + "')]")).click();

        //System.out.println(22);
    }

    @Test
    public void checkCoffee() {
        String coffeePriceExpected = "55р.20к.";
        //open site
        open("https://e-dostavka.by");
        SoftAssert softAssert = new SoftAssert();

        //softAssert.assertEquals(header, 124);
        //click on search button
        String searchLocator = "//div[@class='main_menu__inner']//i[@class='fa fa-search']";
        $(By.xpath(searchLocator)).click();
        //insert in search
        $(By.xpath("//input[@id='searchtext']")).setValue("Кофе молотый «Dallmayr» classic, 250 г.");
        //softAssert.assertEquals(footer, 346536);
        //click on search button
        $(By.xpath(searchLocator)).click();
        //get item price
        String coffeePriceActual = $(By.xpath("//div[@class='price']")).getText();
        System.out.println(coffeePriceActual);
        Assert.assertEquals(coffeePriceActual, coffeePriceExpected, "Coffee price is different!");
        Assert.assertEquals(coffeePriceActual, coffeePriceExpected, "Coffee price is different!");
        Assert.assertEquals(coffeePriceActual, coffeePriceExpected, "Coffee price is different!");
        //softAssert.assertEquals(phone, 2352);


        softAssert.assertAll();


    }

}
