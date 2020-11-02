package com.group2.tests;

import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class BaseTest {

    @BeforeMethod
    public void globalBefore(){

    }
}
