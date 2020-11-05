package com.group2.tests;


import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class MySecondTest extends BaseTest{


//    @BeforeSuite
//    public void  ss(){
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
//    }

    //@Test
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

    //@Test
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


    @DataProvider
    public Object[][] edostavka(){
        Object[][] data = new Object[1][3];

        data[0][0] = "Кофе молотый «Dallmayr» classic, 250 г.";
        data[0][2] = 13.58;


//        data[0][0] = "Кукват";
//        data[0][1] = "//div[@class='tit63426le']/a[contains(text(),'"+data[0][0]+"')]/../following-sibling::div[@class='price456375s__wrapper']//div[@class='price']";
//        data[0][2] = 13.58;

        return data;
    }


    @Test(dataProvider = "edostavka")
    @Severity(SeverityLevel.CRITICAL)
    @Description("dsgsdgsg")
    @TmsLink("JIRA-352")
    @Attachment
    public void findCoffeePrice(String searchText, String priceXpath, double expectedPrice) {

        open("https://e-dostavka.by/");

        String searchLocator = "//div[@class='main_menu__inner']//i[@class='fa fa-search']";
        SelenideElement searchButton = $x(searchLocator);
        searchButton.click();
        $x("//input[@id='searchtext']").setValue(searchText)
                .pressEnter();

//        open("https://github.com/VolhaDubovik/Training_Sparta/blob/master/src/test/java/by/issoft/edostavka/FindGoods.java");
//        Cookie ck = new Cookie("dotcom_user", "artemmoroz");
//        WebDriverRunner.getWebDriver().manage().addCookie(ck);
//        Cookie ck2 = new Cookie("_gh_sess", "");
//        WebDriverRunner.getWebDriver().manage().addCookie(ck2);
//        Cookie ck3 = new Cookie("user_session", "");
//        WebDriverRunner.getWebDriver().manage().addCookie(ck3);
//        open("https://github.com/VolhaDubovik/Training_Sparta/blob/master/src/test/java/by/issoft/edostavka/FindGoods.java");


       // open("https://e-dostavka.by/search/?searchtext=%D0%9A%D0%BE%D1%84%D0%B5+%D0%BC%D0%BE%D0%BB%D0%BE%D1%82%D1%8B%D0%B9+%C2%ABDallmayr%C2%BB+classic%2C+250+%D0%B3.");

        SelenideElement a = $x("//div[@class='title']/a[contains(text(),'"+searchText+"')]");

        a.click();

//        SelenideElement price = a.find(By.xpath("../following-sibling::div[@class='prices__wrapper']//div[@class='price']"));
//
//        String actualPrice = $x(priceXpath).getText();
//
//        actualPrice = actualPrice.replace("р.",".").replace("к.", "");
        double actPrice = 4;//Double.parseDouble(actualPrice);
//
        Assert.assertEquals(expectedPrice, actPrice, "Goods price is different!");

    }

}
