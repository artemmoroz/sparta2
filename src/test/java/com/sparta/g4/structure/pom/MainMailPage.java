package com.sparta.g4.structure.pom;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Data
@Accessors(chain = true)
public class MainMailPage {

    SelenideElement ee = $("xx");

    public void sendEmail(String rec, String sub, String body){
        ee.setValue("sdfs");
    }

    public boolean isEmailSend() {
        return false;
    }
}
