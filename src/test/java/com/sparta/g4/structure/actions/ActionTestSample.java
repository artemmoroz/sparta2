package com.sparta.g4.structure.actions;

import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.annotations.Test;

@Data
@Accessors(chain = true)
public class ActionTestSample {

    @Test
    public void test1(){
        EmailActions actions = new EmailActions();
        actions.login();
        actions.sendEmail();

    }
}
