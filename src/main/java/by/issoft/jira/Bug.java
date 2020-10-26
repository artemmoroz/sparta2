package by.issoft.jira;

import lombok.Data;
import lombok.experimental.Accessors;


public class Bug extends JiraItem{

    public Bug(String name) {
        super(name);
    }
}
