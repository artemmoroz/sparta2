package com.sparta.g4.clinic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Patient {

    String name;
    String diagnose;

}
