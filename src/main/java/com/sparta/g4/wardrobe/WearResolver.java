package com.sparta.g4.wardrobe;


import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class WearResolver {

    Map<WearType, List<String>> wearTypes;

    public WearResolver() {
        wearTypes = new HashMap<>();

        wearTypes.put(WearType.OUTER, Arrays.asList("shuba", "palto"));
        wearTypes.put(WearType.MEDIUM, Arrays.asList("maika", "shtani"));
        wearTypes.put(WearType.UNDER, Arrays.asList("trusi", "noski"));

    }

    public WearType resolve(String wearName){
        for(Map.Entry<WearType, List<String>> entry: wearTypes.entrySet()){
            if(entry.getValue().contains(wearName)){
                return entry.getKey();
            }
        }
        return null;
//        for(WearType types: wearTypes.keySet()){
//
//        }
//
//        for(List<String> ss: wearTypes.values()){
//
//        }
    }

}
