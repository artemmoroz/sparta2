package com.sparta.g4.api;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User11 {
    int userId;
    int id;
    String title;
    boolean completed;
}
