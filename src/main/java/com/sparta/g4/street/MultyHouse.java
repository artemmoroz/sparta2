package com.sparta.g4.street;

import java.io.Serializable;
import java.util.List;

public class MultyHouse extends House {

    String energyEfficiency;
    double coef;

    public MultyHouse(int number, String energyEfficiency) {
        super(number);
        this.energyEfficiency = energyEfficiency;
        switch (energyEfficiency){
            case "A++": {coef=0.2; break;}
            case "A+": {coef=0.5; break;}
            case "A": {coef=0.6; break;}
            case "B": {coef=0.8; break;}
            case "C": {coef=1.2; break;}
        }
    }

//    public MultyHouse(int number, String energyEfficiency, Project project) {
//        this(number, energyEfficiency);
//        flats = project.getFlats();
//        initFromProject(project);
//    }
//
//
//    public void initFromProject(Project project){
//        flats = project.getFlats();
//    }

    @Override
    protected double getCoefficient() {
        return coef;
    }
}
