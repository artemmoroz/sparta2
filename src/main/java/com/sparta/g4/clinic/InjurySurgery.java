package com.sparta.g4.clinic;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;


public class InjurySurgery extends Surgery {

    public InjurySurgery(int number) {
        super(8, 20, number);
        supportedDiagnoses = new HashMap<>();
        supportedDiagnoses.put("arm", 2);
        supportedDiagnoses.put("chmt", 1);
        supportedDiagnoses.put("neck", 2);
        supportedDiagnoses.put("leg", 2);
    }
}
