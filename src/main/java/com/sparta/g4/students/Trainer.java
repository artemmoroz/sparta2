package com.sparta.g4.students;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Trainer {

    String name;

    public Trainer(String name) {
        this.name = name;
    }
}
