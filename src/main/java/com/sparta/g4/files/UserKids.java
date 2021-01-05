package com.sparta.g4.files;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserKids {


    String name;
    int age;
}
