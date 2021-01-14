package com.sparta.g4.students;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;


public class Lecture extends Task{


    public Lecture(String name) {
        super(name, 5);
    }

    @Override
    protected boolean isTaskDone(Student student) {
        return true;
    }
}
