package com.sparta.g4.students;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

@Data
@Accessors(chain = true)
public class Course {

    String name;
    List<Task> tasks;
    List<Trainer> trainers;
    List<Student> students;

    public Course(String name, List<Trainer> trainers) {
        this.name = name;
        this.trainers = trainers;
    }

    public void runCourse() {
        for (Task task : tasks) {
            task.execute(students, selectTrainerForTask(task));
        }
    }

    protected Trainer selectTrainerForTask(Task task) {
        if(trainers.isEmpty()){
            throw new IllegalStateException("No trainer for this task!");
        }
        if(trainers.size()>1){
            int trainerIndex = new Random().nextInt(trainers.size()-1);
            return trainers.get(trainerIndex);
        }else{
            return trainers.get(0);
        }
    }

    public void printResults() {
        for(Student student: students){
            System.out.println("["+student.getName() + "] has level " + student.getLevel());
        }
    }
}
