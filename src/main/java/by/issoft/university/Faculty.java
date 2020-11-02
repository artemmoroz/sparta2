package by.issoft.university;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Faculty extends BaseExaminator {
    String name, address;

    public Faculty(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
