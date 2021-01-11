package com.sparta.g4;


import com.github.javafaker.Faker;
import lombok.Data;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBefore<TestBeforeStore> extends BaseTest{

    @Data
    public class TestBeforeStore extends com.sparta.g4.Store {

        public String name;

    }



    @BeforeMethod
    public void ddd(){
        //getData().setName(new Faker().name().fullName())
        //System.out.println(Thread.currentThread().getId() + ": " + getData().getName());

    }

    @Test
    public void testst(){
        //System.out.println(Thread.currentThread().getId() + ": " +name.get());

    }

    @Test
    public void ffff(){
        //System.out.println(Thread.currentThread().getId() + ": " +name.get());
    }
}
