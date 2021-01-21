package com.sparta.g4.api;

import io.restassured.config.RestAssuredConfig;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.testng.Assert;

import java.util.Arrays;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {


    public static void main(String[] args) {

//        RequestSpecification requestSpecification = new RequestSpecificationImpl("https://jsonplaceholder.typicode.com");
//        ResponseSpecification responseSpecification;
//
//        requestSpecification.auth().basic("sdsad", "dsdg").header("xxx", "tttt");
//
//        RestAssuredConfig restAssuredConfig = new RestAssuredConfig();
//        restAssuredConfig.logConfig().and().connectionConfig().encoderConfig();
//
//        requestSpecification.config(restAssuredConfig)
//
//        given(requestSpecification).get("/dfsd")
//        given(requestSpecification).get("/dfsd2")
//        given(requestSpecification).get("/dfsd3")
//        given(requestSpecification).get("/dfsd4")



        String url = "zxfdgdgsdg"+"sdgsdgs"+"|sdgsdgsdg";
        Response rr = get("https://jsonplaceholder.typicode.com/todos/1")
                .andReturn();

        //given().body("{[dfsgdsdg]}").post("xxxx").andReturn();


        if (rr.getStatusCode() == 200) {
            //rr.then().assertThat().body("id", response -> equalTo(2));
            Assert.assertEquals(rr.jsonPath().getInt("id"), 2, "xxx");
//            User11 resp = rr.as(User11.class);
//            System.out.println(resp);
        } else {
            System.out.println(4444);
        }
    }

}
