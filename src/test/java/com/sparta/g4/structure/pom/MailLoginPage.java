package com.sparta.g4.structure.pom;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Data
@Accessors(chain = true)
public class MailLoginPage {

    SelenideElement loginInput = $("eeee");
    SelenideElement passwordInput = $("xxx");
    SelenideElement continueButton = $("xxx");
    SelenideElement submitButton = $("xxx");


    public void login(String login, String pass){
        loginInput.setValue(login);
        continueButton.click();
        passwordInput.setValue(pass);
        submitButton.click();
    }
}
