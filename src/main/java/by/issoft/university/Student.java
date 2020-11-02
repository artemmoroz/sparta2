package by.issoft.university;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Random;

@Data
@Accessors(chain = true)
public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public double examine() {
        return new Random().nextInt(10);
    }
}
