package com.group2.tests.pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

@Data
@Accessors(chain = true)
public class Test1 {

    private static final String filePath = "src/test/resources/cart.json";


    @Data
    public static class EmailData{

        String login;
        String password;
        List<Message> messages;
    }

    @Data
    public static class Message{
        String recipient;
        String title;
        String body;
    }

    static ObjectMapper mapper = new ObjectMapper();

    private static EmailData getEmailData() throws IOException {
        EmailData emailData = mapper.readValue(Paths.get(filePath).toFile(), EmailData.class);
        return emailData;
    }

    @DataProvider
    public Object[][] sender() throws IOException {    //args: String login, String password

        EmailData emailData = getEmailData();

        Object[][] loginData = new Object[1][2];
        loginData[0][0] = emailData.getLogin();
        loginData[0][1] = emailData.getPassword();

        return loginData;

    }

    @DataProvider
    public Object[][] message() throws IOException { // message

        EmailData emailData = getEmailData();
        Object[][] messageData = new Object[emailData.getMessages().size()][1];
        for (int i = 0; i < emailData.getMessages().size(); i++) {
            Message m = emailData.getMessages().get(i);
            messageData[i][0] = m;
        }

        return messageData;
    }

    @DataProvider
    public Object[][] message2() throws IOException { // message

        EmailData emailData = getEmailData();
        Object[][] messageData = new Object[1][1];
        List<Message> mess = emailData.getMessages();
        messageData[0][0] = mess;
        return messageData;
    }


    @Test(dataProvider = "sender")
    public void login(String login, String password){
        System.out.println(login + " "+password);
    }

    @Test(dataProvider = "message")
    public void message(Message message){
        String rec = "$()";
        System.out.println("setting r" + message.getRecipient());
        System.out.println("setting t" + message.getTitle());
        System.out.println("setting b" + message.getBody());
    }

    @Test(dataProvider = "message2")
    public void message2(List<Message> list){
        System.out.println(list.size());
    }


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        EmailData emailData = mapper.readValue(Paths.get(filePath).toFile(), EmailData.class);
        System.out.println(emailData.getLogin());

        System.out.println(emailData.getMessages().get(0).getRecipient());


    }

//
//    private JsonObject readFromFile(String file){
//        FileReader reader = new FileReader(filePath);
//
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
//        return jsonObject;
//    }
//
//
//    @DataProvider
//    public Object[][] sender() {    //args: String login, String password
//
//        Object[][] sendData = new Object[0][];
//        try {
//            //считывание файла
//
//            JSONObject jsonObject = readFromFile(filePath);
//
//            //получение строки из объекта
//            String login = (String) jsonObject.get("login");
//
//            String password = (String) jsonObject.get("password");
//
//            sendData = new Object[1][2];
//            sendData[0][0] = login;
//            sendData[0][1] = password;
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return sendData;
//    }
//
//    @DataProvider
//    public Object[][] message() {
//
//        Object[][] message = new Object[0][0];
//        try {
//            //считывание файла. как избежать дублирования?
//            JSONObject jsonObject = readFromFile(filePath);
//
//            // получение массива
//            JSONArray messagesArray = (JSONArray) jsonObject.get("messages");
//            int messagesCount = messagesArray.size();
//            System.out.println(messagesCount);
//            String recipients = "";
//            String titles = "";
//            String bodies = "";
//            Iterator i = messagesArray.iterator();
//
//            message = new Object[3][messagesCount];
//            int y = 0;
//            for (int z = 0; z < messagesCount; z++) {
//                JSONObject messagesObj = (JSONObject) i.next();
//                message[0][y] = messagesObj.get("recipient");
//                message[1][y] = messagesObj.get("title");
//                message[2][y] = messagesObj.get("body");
//                y += 1;
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return message;
//    }
//


}
