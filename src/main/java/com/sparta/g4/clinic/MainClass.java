package com.sparta.g4.clinic;

import java.util.Arrays;

public class MainClass {


    public static void main(String[] args) {
        Clinic clinic = new Clinic("BSMP");

        Surgery botox = new BotoxSurgery(1);
        Surgery injury = new InjurySurgery(2);
        Surgery common = new CommonSurgery(3);

        clinic.addSurgeries(
                Arrays.asList(
                        botox, injury, common
                )
        );

        //setup
        clinic.put(new Patient("Gala", "grudi"));
        clinic.put(new Patient("Kostja", "arm"));
        clinic.put(new Patient("Petja", "nosoglotka"));
        clinic.put(new Patient("Masha", "popa"));
        clinic.put(new Patient("Oleg", "ukol"));
        clinic.put(new Patient("Roma", "chmt"));
        clinic.put(new Patient("Olga", "neck"));
        //end


        Patient vasja = new Patient("Vasja I", "leg");

        String operationDate = clinic.put(vasja);
        System.out.println(operationDate);


    }


}
