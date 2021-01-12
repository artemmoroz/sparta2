package com.sparta.g4.clinic;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Surgery {

    int openTime;
    int closeTime;
    int number;

    Map<String, Integer> supportedDiagnoses;
    Map<Date, Integer> spareTime;

    public Surgery(int openTime, int closeTime, int number) {
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.number = number;
        this.spareTime = new HashMap<>();
    }

    public boolean isSupportedDiagnose(String diagnose){
        if(supportedDiagnoses==null){
            if(diagnose.length()<4) {
                return true;
            }else{
                return false;
            }
        }
        return supportedDiagnoses.containsKey(diagnose);
    }

    public Integer getDiagnoseHours(String diagnose){
        if(supportedDiagnoses==null){
            return 2;
        }
        return supportedDiagnoses.get(diagnose);
    }

    public Date proposeManipulationDate(int manipulationDuration){
        Date lastDate = null;

        for (Map.Entry<Date, Integer> t: spareTime.entrySet()){
            lastDate = t.getKey();
            int time = t.getValue();
            if(time<=manipulationDuration){
                int newTime = time-manipulationDuration;
                spareTime.put(lastDate, newTime);
                return lastDate;
            }
        }
        if(lastDate==null){
            lastDate = new Date();
        }else {
            lastDate.setDate(lastDate.getDate() + 1);
        }
        spareTime.put(lastDate, closeTime-openTime-manipulationDuration);
        return lastDate;

    }



}
