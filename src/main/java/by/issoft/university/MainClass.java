package by.issoft.university;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Data
@Accessors(chain = true)
public class MainClass {


    public static void main(String[] args) {
        Faculty faculty = new Faculty("A1", "Lenina 1");

        Student s1 = new Student("vasia");
        Student s2 = new Student("olja");
        Student s3 = new Student("petha");
        Student s4 = new Student("kostja");


        faculty.addStudents(Arrays.asList(s1, s2, s3, s4));


        Group group1 = new Group("g1");
        group1.addStudents(Arrays.asList(s1, s3, s4));


        Group group2 = new Group("g2");
        group2.addStudents(Arrays.asList(s2));


        group1.doExam();
        System.out.println(group1.getTotalMarks());

        faculty.doExam();
        System.out.println(faculty.getTotalMarks());

    }

}
