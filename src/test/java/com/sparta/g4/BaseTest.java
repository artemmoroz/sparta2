package com.sparta.g4;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BaseTest<T> {

    protected ThreadLocal<T> data = new ThreadLocal<>();



    public <T extends Store> T getData(){
        return (T) data.get();
    }
}
