package by.issoft.university;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Group extends BaseExaminator{

    String number;

    public Group(String number) {
        this.number = number;
    }
}
