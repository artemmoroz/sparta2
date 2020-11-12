package com.group2.tests.pom;

import lombok.Data;
import lombok.experimental.Accessors;

import java.nio.file.Paths;

@Data
@Accessors(chain = true)
public class DataManager {

    static Test1.EmailData emailData;

    public static Test1.EmailData getEmailData(String fileName) {
        if (emailData == null) {
            //emailData = mapper.readValue(Paths.get(filePath).toFile(), Test1.EmailData.class);
            System.out.println("reading file");
            emailData = new Test1.EmailData();
            emailData.setLogin("HI");
        }
        return emailData;
    }

    public static void main(String[] args) {
        System.out.println(DataManager.getEmailData("xxx.json"));
        System.out.println(DataManager.getEmailData("xxx.json"));
        System.out.println(DataManager.getEmailData("xxx.json"));
        System.out.println(DataManager.getEmailData("xxx.json"));
        System.out.println(DataManager.getEmailData("xxx.json"));
        System.out.println(DataManager.getEmailData("xxx.json"));

    }
}
