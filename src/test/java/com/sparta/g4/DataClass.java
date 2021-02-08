package com.sparta.g4;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class DataClass {

    int size;
    String name;
    String color;
    @JsonIgnore
    List<Car> carList;
}
