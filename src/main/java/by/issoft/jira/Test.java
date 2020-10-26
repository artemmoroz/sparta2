package by.issoft.jira;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Test extends JiraItem {

    List<Bug> bugs;
    Task parentTask;

    public Test(String name) {
        super(name);
        bugs = new ArrayList<>();
    }

    public void setParentTask(Task parentTask) {
        this.parentTask = parentTask;
    }

    public void validate() {

        boolean result = new Random().nextBoolean();
        System.out.println("Test "+name + " result " + result);
        if(!result){
            int maxBugs = new Random().nextInt(2)+1;//0.1.2 -> 1.2.3
            for (int i = 0; i < maxBugs; i++) {
                Bug b = new Bug("this is a bug for test "
                        + name + " for uniqueness " + i);
                bugs.add(b);
                parentTask.addBug(b);
            }
        }
        //return bugs;
    }
}
