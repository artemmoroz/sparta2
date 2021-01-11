package com.sparta.g4.clinic;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@Accessors(chain = true)
public class Clinic {

    String name;
    List<Surgery> surgeries;


    public Clinic(String name){
        this.name = name;
    }

    public void addSurgeries(List<Surgery> surgeries){
        this.surgeries = surgeries;
    }

    public String put(Patient patient){
        for(Surgery surgery: surgeries){
            if(surgery.isSupportedDiagnose(patient.getDiagnose())){
                Integer diagnoseHours = surgery.getDiagnoseHours(patient.getDiagnose());
                Date date = surgery.proposeManipulationDate(diagnoseHours);
                return patient.getName() + "'s operation "+ date+ " surgery no "+ surgery.getNumber();
            }
        }
        return "no surgeries for your diagnose for "+patient.getName();
    }
}
