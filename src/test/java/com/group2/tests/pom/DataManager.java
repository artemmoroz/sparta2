package com.group2.tests.pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.util.List;

@Data
@Accessors(chain = true)
public class DataManager {

    static Test1.EmailData emailData;

    public static Test1.EmailData getEmailData2(String fileName) {
        if (emailData == null) {
            //emailData = mapper.readValue(Paths.get(filePath).toFile(), Test1.EmailData.class);
            System.out.println("reading file");
            emailData = new Test1.EmailData();
            emailData.setLogin("HI");
        }
        return emailData;
    }

//
//    public Test1.EmailData getEmailData(String fileName) {
//
//            return mapper.readValue(Paths.get(filePath).toFile(), Test1.EmailData.class);
//
//    }

    @DataProvider
    public Object[][] ddd(){
        Object[][] aa = null;
        Test1.EmailData x = DataManager.getEmailData2("x");
        return aa;
    }

    @BeforeMethod
    public void sss(){
        Test1.EmailData x = DataManager.getEmailData2("x");
        //login(x.getLogin(), x.getPassword())
    }

    @Test
    public void asd(){
        Test1.EmailData x = DataManager.getEmailData2("x");
    }


    public static void main(String[] args) {
        System.out.println(DataManager.getEmailData2("xxx.json"));
        System.out.println(DataManager.getEmailData2("xxx.json"));
        System.out.println(DataManager.getEmailData2("xxx.json"));
        System.out.println(DataManager.getEmailData2("xxx.json"));
        System.out.println(DataManager.getEmailData2("xxx.json"));
        System.out.println(DataManager.getEmailData2("xxx.json"));


    }
}
