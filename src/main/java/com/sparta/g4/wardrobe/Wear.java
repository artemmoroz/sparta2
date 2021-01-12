package com.sparta.g4.wardrobe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Wear {

    String name;
    int w;
    int h;
    int l;

    public int getVolume(){
        return w*h*l;
    }
}
