package com.sparta.g4.email;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TestData {

    User user;
    Email email;

//    @Test
//    public void test1(TestData e){
//        login(e.getUser());
//        sendEmail(e.getEmail());
//        logut(e.getUser());
//    }
}
