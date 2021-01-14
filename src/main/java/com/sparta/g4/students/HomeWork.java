package com.sparta.g4.students;

import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;


public class HomeWork extends Task {

    public HomeWork(String name, int weight) {
        super(name, weight);
    }

    @Override
    protected boolean isTaskDone(Student student) {
        return new Random().nextBoolean();
    }
}
