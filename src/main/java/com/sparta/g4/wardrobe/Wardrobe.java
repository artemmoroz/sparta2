package com.sparta.g4.wardrobe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Wardrobe {

    List<Shelf> shelves;
    WearResolver wearResolver = new WearResolver();

    public Wardrobe(List<Shelf> shelves) {
        this.shelves = shelves;
    }

    public void put(Wear wear) {
        int v = wear.getVolume();
        WearType type = wearResolver.resolve(wear.getName());
        boolean flag = false;
        for(Shelf shelf: shelves){
            if(shelf.getType().equals(type)){
                if(shelf.getSpareVolume()>=v){
                    shelf.getWearList().add(wear);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            for(Shelf shelf: shelves){
                if(shelf.getSpareVolume()>=v){
                    shelf.getWearList().add(wear);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("no spare place for "+ wear);
        }

    }
}
