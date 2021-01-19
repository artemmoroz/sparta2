package com.sparta.g4.web;

import com.codeborne.selenide.*;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

@Data
@Accessors(chain = true)
public class FirstWebTest {


    @Test
    public void userCanLoginByUsername() {

        open("https://www.google.com/");


       // click("//input[@name='q']");

        Configuration.timeout = 5000;
        SelenideElement element = $x("//input[@name='q']");
        element.waitUntil(Condition.visible, Configuration.timeout, 700);
        element.click();

        WebDriver webDriver = WebDriverRunner.getWebDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement qElement = webDriver.findElement(By.xpath("//input[@name='q']"));
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5, 700);
        webDriverWait.until(ExpectedConditions.visibilityOf(qElement));
        qElement.click();


        //setValue("Hello sparta").pressEnter();
        $(By.name("q")).setValue("Hello sparta").pressEnter();
        $(By.xpath("//input[@name='q']")).setValue("Hello sparta").pressEnter();


        String resText = $("#result-stats").getText();
        $(By.id("result-stats")).shouldHave(Condition.visible);

//        Assert.assertTrue(
//                resText.contains("550"),
//                "NO VALIDA RESULTS FOUND");

        System.out.println($(".g").getText());

        ElementsCollection elements = $$(".g");
        System.out.println("Size " + elements.size());
        System.out.println("TTT " + elements.get(3).getText());

    }

}
