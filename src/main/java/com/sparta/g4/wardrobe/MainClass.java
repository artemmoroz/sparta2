package com.sparta.g4.wardrobe;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.HashMap;

@Data
@Accessors(chain = true)
public class MainClass {


    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(
                Arrays.asList(
                        new Shelf(200, WearType.OUTER),
                        new Shelf(120, WearType.MEDIUM),
                        new Shelf(100, WearType.MEDIUM),
                        new Shelf(50, WearType.UNDER),
                        new Shelf(50, WearType.UNDER),
                        new Shelf(30, WearType.UNDER),
                        new Shelf(30, WearType.UNDER)
                )
        );


        wardrobe.put(new Wear("trusi", 2, 4, 1));
        wardrobe.put(new Wear("shuba", 12, 6, 3));
        wardrobe.put(new Wear("palto", 6, 3, 4));
        wardrobe.put(new Wear("maika", 2, 7, 2));
        wardrobe.put(new Wear("maika", 3, 8, 2));
        wardrobe.put(new Wear("noski", 1, 1, 1));
        wardrobe.put(new Wear("noski", 2, 1, 1));
        wardrobe.put(new Wear("shtani", 7, 2, 4));
        wardrobe.put(new Wear("shtani", 6, 3, 3));
        wardrobe.put(new Wear("maika", 3, 4, 2));
    }


}
