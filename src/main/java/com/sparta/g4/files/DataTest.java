package com.sparta.g4.files;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class DataTest {

    public void doTest() throws IOException {

        String p = "/Users/artemmoroz/Projects/training/sparta/src/main/resources/users.json";

//        File d = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"users.json");
//
//        Path path = Paths.get("src", "main", "resources", "users.json");
//
//        File testuser = new File("testUser.json");
//
//        String content = new String(Files.readAllBytes(testuser.toPath()));
//        System.out.println(content);

//        UserJson aaa = new ObjectMapper().readValue(this.getClass().getClassLoader().getResourceAsStream("users.json"), UserJson.class);
//        System.out.println(aaa.getUsername());

        List<UserJson> userJsons =
                new ObjectMapper()
                        .readValue(new File(p), new TypeReference<List<UserJson>>() {});
        System.out.println(userJsons.get(1).getKids().get(1).getName());
//
//        UserJson artem2 = new UserJson();
//        artem2.setUsername("sdgsdgsh");
//        artem2.setIsmale(true);
//        artem2.setAge(4363);
//        artem2.setAaa("aaaa");
//        artem2.setBbb("bbbbb");
//
//        new ObjectMapper()
//                .writerWithDefaultPrettyPrinter()
//                .writeValue(new File("testUser.json"), artem2);


//        UserJson userJson = new ObjectMapper()
//                .readValue(content, UserJson.class);
//
//        System.out.println(userJson.getPass());
//        System.out.println(userJson.getKids());


//        String[] strings = content.split(",");
//
//        String login = strings[0];
//        String pass = strings[1];
//
//        System.out.println("login to the system "+login+" : "+ pass);

    }

    public static void main(String[] args) throws IOException {
        new DataTest().doTest();
    }

}
