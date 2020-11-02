package com.group2.tests;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DataReader {

    protected Object readFromFile(String path){
        //
        return null;
    }
}
