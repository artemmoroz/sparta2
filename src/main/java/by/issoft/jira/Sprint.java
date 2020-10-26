package by.issoft.jira;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;


public class Sprint extends JiraItem{

    List<Task> tasks;

    public Sprint(String name) {
        super(name);
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void executeRegression() {
        for(Task t: tasks){
            t.doTests();
        }
        System.out.println("*********** Sprint stats **********");
        int bugsCount = 0;
        int testsCount = 0;
        for(Task t: tasks){
            bugsCount += t.getBugs().size();
            testsCount += t.getTests().size();
        }
        System.out.println("Total tests "+testsCount);
        System.out.println("Total bugs "+bugsCount);
        System.out.println("-------------------");
        tasks.forEach(t->
        t.getBugs().forEach(b-> System.out.println(b))
                );


    }
}
