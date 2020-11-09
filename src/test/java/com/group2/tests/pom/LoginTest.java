package com.group2.tests.pom;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
@Accessors(chain = true)
@Slf4j
public class LoginTest {


  LoginPage loginPage;

  MainPage mainPage;

    @Test
    public void login1test(){
        open("xxxx");
//        loginPage.getLogin().setValue("sdfsdf");
//        loginPage.getPass().setValue("sdfsdf");
//        log.info("1");
        mainPage = loginPage.login("valid", "valid");
        //assert ok

        mainPage.logout();

        Assert.assertTrue(loginPage.isLoginPerformdCorreclty());
    }

    @Test
    public void login2test(){
        loginPage.login("invalid", "invalid");
        //assert hint
    }

    @Test
    public void cartTest(){
        loginPage.login("valid", "valid");

        $("cart").click();
        //validate
    }


}
