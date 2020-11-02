package by.issoft.university;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class BaseExaminator {

    List<Student> studentList = new ArrayList<>();

    double allMarks;

    public void addStudents(List<Student> students) {
        studentList.addAll(students);
    }

    public void doExam() {
        for (Student s : studentList) {
            allMarks += s.examine();
        }
    }

    public double getTotalMarks() {
        return allMarks/studentList.size();
    }

}
