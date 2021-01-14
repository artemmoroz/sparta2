package com.sparta.g4.students;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Accessors(chain = true)
public class MainClass {

    public static List<Student> getStudentList() {
       return  Arrays.asList(
            new Student("Sergey", 5),
            new Student("Masha", 0),
            new Student("mitya", 2),
            new Student("Oksana", 2)
        );
    }

    public static List<Task> getTaskList() {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Lecture("Git"));
        taskList.add(new Lecture("OOP"));
        taskList.add(new Lecture("Maven"));
        taskList.add(new Lecture("OOP"));
        taskList.add(new HomeWork("OOP", 3));
        taskList.add(new HomeWork("Git", 13));
        taskList.add(new HomeWork("List", 1));
        taskList.add(new HomeWork("Map", 4));
        taskList.add(new HomeWork("Abstract", 7));
        return taskList;
    }

    public static void main(String[] args) {
        List<Student> students = getStudentList();
        Course course = new Course("Java basic", Arrays.asList(new Trainer("Artem")));
        course.setTasks(getTaskList());
        course.setStudents(students);

        course.runCourse();

        course.printResults();
    }
}
