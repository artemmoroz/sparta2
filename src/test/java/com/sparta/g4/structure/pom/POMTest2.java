package com.sparta.g4.structure.pom;

import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@Accessors(chain = true)
public class POMTest2 {

    MailLoginPage loginPage = new MailLoginPage();


    DataObject ddd;

    @Test
    public void test1(DataObject ss){

        loginPage.login("xx", "tt");
      //xxxx
        Assert.assertTrue(true);

    }

}
