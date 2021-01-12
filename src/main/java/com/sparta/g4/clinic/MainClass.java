package com.sparta.g4.clinic;

import java.util.Arrays;

public class MainClass {


    public static void main(String[] args) {
        System.out.println("Starting app");
        Clinic clinic = new Clinic("BSMP");

        clinic.addSurgeries(
                Arrays.asList(
                        new BotoxSurgery(1),
                        new InjurySurgery(2),
                        new CommonSurgery(3)
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

        System.out.println("Init finish");
        Patient vasja = new Patient("Vasja I", "leg");

        String operationDate = clinic.put(vasja);
        System.out.println(operationDate);


    }


}
