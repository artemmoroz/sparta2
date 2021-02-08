package com.sparta.g4.structure.pom;

import com.sparta.g4.structure.actions.EmailActions;
import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@Accessors(chain = true)
public class POMTest {

    MailLoginPage loginPage = new MailLoginPage();
    MainMailPage mailPage = new MainMailPage();

    @Test
    public void test1(){

        loginPage.login("xx", "tt");
        mailPage.sendEmail("gfgd", "dfgdf", "fdgdfh");
        Assert.assertTrue(mailPage.isEmailSend());

    }

}
