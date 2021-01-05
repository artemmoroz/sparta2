package com.sparta.g4.files;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserJson {

    String username;
    String pass;
    double age;
    boolean ismale;
    List<String> roles;
    List<UserKids> kids;

    @JsonProperty("xxxx")
    String bbb;

    @JsonIgnore
    String aaa;


}
