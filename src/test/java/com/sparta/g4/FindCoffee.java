package com.sparta.g4;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

@Data
@Accessors(chain = true)
public class FindCoffee {

    String link;

    @Parameters({"link"})
    @BeforeClass
    public void setUp(String link) {
        this.link = link;
    }

    @BeforeMethod
    public void openLink() {
        open(link);
    }

    @Test(dataProvider = "getInputCoffee")
    public void FindCoffeeLavazza1(String coffeeName, Double pricePerKilo) {
        $x("//div[@class='main_menu__inner']//child::li[@id='main_menu__search']").click();
        //$x("//input[@id='searchtext']").setValue(coffeeName).pressEnter();
        $(By.id("searchtext")).setValue(coffeeName).pressEnter();

        String xPath = "//div[@class='title']/a[contains(text(),'" + coffeeName + "')]/.." +
                "//following-sibling::div[@class='prices__wrapper']//div[@class='price_byn']/div[@class='price']";
        SelenideElement xxx = $x(xPath);
        Assert.assertTrue(xxx.exists(), "Элемент на найден");
        String returnedPrice = xxx.getText()
                .replaceAll("\n.*", "")
                .replaceAll("[а-яА-Я]", "")
                .replaceAll(".$", "");
        Assert.assertEquals(
                2 * Double.parseDouble(returnedPrice),
                pricePerKilo,
                "Цена за 1кг не совпадает");

    }

    @Test(dataProvider = "getInputCoffee")
    public void FindCoffeeLavazza2(String coffeeName, String pricePerKilo) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Big Sur");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "86.0");
        caps.setCapability("resolution", "1600x1200");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.console", "info");
        caps.setCapability("browserstack.networkLogs", "true");
        caps.setCapability("browserstack.selenium_version", "3.14.0");

        Configuration.browserCapabilities = caps;


        Configuration.startMaximized = true;


        $x("//div[@class='main_menu__inner']//child::li[@id='main_menu__search']").click();
        $x("//input[@id='searchtext']").setValue(coffeeName).pressEnter();
        Assert.assertTrue(
                $x("//a[contains(text(),'" + coffeeName + "')]").isDisplayed(),
                "Элемент на найден"
        );
        //$x("//a[contains(text(),'" + coffeeName + "')]").click();
        Assert.assertEquals(
                $x("//ul[@class='description']/li[last()]/span").getText(),
                pricePerKilo,
                "Цена за 1кг не совпадает");

        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue("login");
//        softAssert.assertTrue("pass");
//        //do some action
//
//        Assert.assertEquals(
//                $x("//ul[@class='description']/li[last()]/span").getText(),
//                pricePerKilo,
//                "Цена за 1кг не совпадает");
//
//        softAssert.assertTrue("xxxx");
        softAssert.assertAll();

        getElement("login-input");
        getElement("password-input");

    }

    public SelenideElement getElement(String id){
        return $x("//*[@data-testid='"+id+"']");
    }

    @Test(dataProvider = "getInputCoffee")
    public void FindCoffeeLavazza3(String coffeeName, String pricePerKilo) {
        $x("//div[@class='main_menu__inner']//child::li[@id='main_menu__search']").click();
        $x("//input[@id='searchtext']").setValue(coffeeName).pressEnter();
        String xPath = "//a[@class='to_favorite fa fa-heart ']//following-sibling::div[@class='title']";
        coffeeName = clearString(coffeeName);
        ElementsCollection elements = $$(By.xpath(xPath));
        boolean found = false;
        for (SelenideElement element: elements) {
//        for (int i = 0; i < elements.size(); i++) {
//            SelenideElement element = elements.get(i);
            String nameFromSite = clearString(element.getText());
            if (nameFromSite.contains(coffeeName)) {
                element.click();
                found = true;
                Assert.assertEquals(
                        $x("//ul[@class='description']/li[last()]/span").getText(),
                        pricePerKilo,
                        "Цена за 1кг не совпадает");
                break;
            }
//            if (i == elements.size() - 1) {
//                Assert.fail("Элемент на найден");
//            }
        }
        if(!found){
            Assert.fail("Элемент на найден");
        }
    }


    @Test(dataProvider = "getInputCoffee")
    public void findCoffeeLavazza4(InputCoffee inputCoffee) {
        $x("//input[@id='searchtext']").setValue(inputCoffee.getCoffeeName()).pressEnter();
        $("xxx"+inputCoffee.getColor());
    }

    @DataProvider
    public Object[][] getInputCoffee() throws IOException {
        List<InputCoffee> inputCoffees = new ObjectMapper()
                .readValue(
                        Paths.get("src", "test", "resources", "findCoffeeInput.json").toFile(),
                        new TypeReference<List<InputCoffee>>() {});
        Object[][] inputData = new Object[inputCoffees.size()][1];
//        for (int i = 0; i < inputCoffees.size(); i++) {
//            inputData[i][0] = inputCoffees.get(i).getCoffeeName();
//            inputData[i][1] = inputCoffees.get(i).getPricePerKilo();
//        }

        for (int i = 0; i < inputCoffees.size(); i++) {
            inputData[i][0] = inputCoffees.get(i);
        }

        return inputData;
    }

    public String clearString(String string) {
        return string
                .toLowerCase()
                .replaceAll("[\\'\"«»]", "")
                .replaceAll("а", "a")
                .replaceAll("е", "e")
                .replaceAll("о", "o")
                .replaceAll("у", "y")
                .replaceAll("с", "c")
                .replaceAll("р", "p")
                .replaceAll("х", "x");
    }
}
