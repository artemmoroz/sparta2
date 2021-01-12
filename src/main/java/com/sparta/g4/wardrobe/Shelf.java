package com.sparta.g4.wardrobe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Shelf {

    int v;
    WearType type;
    List<Wear> wearList;

    public Shelf(int v, WearType type) {
        this.v = v;
        this.type = type;
        this.wearList = new ArrayList<>();
    }

    public int getSpareVolume() {
        int tmpVolume = 0;
        for(Wear wear: wearList){
            tmpVolume += wear.getVolume();
        }
        return v - tmpVolume;
    }
}
