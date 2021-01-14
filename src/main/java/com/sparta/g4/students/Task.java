package com.sparta.g4.students;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;


public abstract class Task {

    protected String name;
    protected int weight;

    public Task(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void execute(List<Student> students, Trainer trainer) {
        for (Student student : students) {
            if(isTaskDone(student)) {
                student.setLevel(student.getLevel() + weight);
            }
        }
    }

    protected abstract boolean isTaskDone(Student student);



}
