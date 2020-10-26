package by.issoft.jira;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
public class JiraItem {

    private String id;
    protected String name;

    public JiraItem(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        JiraItem j = new JiraItem("sdgs");

    }
}
