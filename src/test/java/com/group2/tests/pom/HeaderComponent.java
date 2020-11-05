package com.group2.tests.pom;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Data
@Accessors(chain = true)
public class HeaderComponent extends BaseComponent{


    SelenideElement header = $("dgsdg");
    SelenideElement profile = $("dgsdg");

}
