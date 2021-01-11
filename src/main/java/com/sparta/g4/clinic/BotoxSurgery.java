package com.sparta.g4.clinic;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;


public class BotoxSurgery extends Surgery {

    public BotoxSurgery(int number) {
        super(10, 16, number);
        supportedDiagnoses = new HashMap<>();
        supportedDiagnoses.put("popa", 5);
        supportedDiagnoses.put("grudi", 3);
    }
}
