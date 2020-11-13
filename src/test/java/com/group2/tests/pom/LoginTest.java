package com.group2.tests.pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.group2.tests.MBy;
import com.group2.tests.SomeClass;
import javafx.util.Pair;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;


public class LoginTest {

    @Test(dataProvider = "xxx")
    public void test1(LoginTest f, Test1.Message message){
//        SomeClass someClass = new SomeClass();
//
//        System.out.println(someClass.getName());
//        softAssert.assertEquals(mailYandexPage.getLastEmailBody(), message.getTextBody(), "There is no email with such body");
//        SomeClass fv12 = someClass.getClas3s();
//        $x("//input[@id='passp-field-login']");
//        $(By.id("passp-field-login"));
//        $("#passp-field-login");
        //"." - class
        //"#" - id
    }


    static By nestedMailLAbel = By.cssSelector(".cls12");

    public static void main(String[] args) {
        String cls = "blob-code blob-code-inner js-file-line";
        System.out.println(cls.contains("blob"));
        ElementsCollection cc = $$("{5}");
        for (SelenideElement mail: cc){
            mail.findAll(nestedMailLAbel);
        }

        $$("").stream().limit(5).forEach(mail->{
            //sdadasda
        });
    }

    @DataProvider
    public Object[][] xxx(){
        Object[][] data = new Object[1][3];

        return data;
    }



    private static final String filePath = "src/test/resources/message.json";

    @BeforeMethod
    public void before(){
   //     String login = getEmailData().getLogin();
    }




    public Object[][] sender() {    //args: String login, String password

        Object[][] sendData = new Object[0][];
        DataManager.getEmailData2("xxx");
        return sendData;
    }

    @DataProvider
    public Object[][] message() {

        Object[][] message = new Object[0][0];
        DataManager.getEmailData2("xxx");
        return message;
    }




}
