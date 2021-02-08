package com.sparta;

import com.codeborne.selenide.Selenide;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.File;

@Data
@Accessors(chain = true)
public class TstPath {

    public static void main(String[] args) {
        String s = "."+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"cart_qa.json";
        System.out.println(new File(s).exists());

        Selenide.executeJavaScript("return core;");
        Selenide.executeJavaScript("return windows.localStore.dgsdgk = 235");

        WebDriver webDriver = null;
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("return core");
        javascriptExecutor.executeScript(String.format(
                "return window.localStorage.getItem('%s');", "xxx"));

    }
}
