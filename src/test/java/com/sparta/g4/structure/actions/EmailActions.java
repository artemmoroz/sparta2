package com.sparta.g4.structure.actions;

import lombok.Data;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Data
@Accessors(chain = true)
public class EmailActions {

    public void login(){
        //
        $("xxx").click();
    }

    public void sendEmail(){
        //
        //$("xxx").click();
        xxx();
    }

    private void xxx(){
        $("xxx").click();
    }

    public void checkEmail(){
        //
        //$("xxx").click();
        xxx();
    }
}
