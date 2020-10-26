package by.issoft.jira;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task extends JiraItem{

    List<Test> tests;
    List<Bug> bugs;


    public Task(String name) {
        super(name);
        tests = new ArrayList<>();
        bugs = new ArrayList<>();
    }

    public void addTest(Test test) {
        tests.add(test);
        test.setParentTask(this);
    }

    public void addBug(Bug bug) {
        bugs.add(bug);
    }

    public List<Bug> getBugs() {
        return bugs;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void doTests() {
//        for (int i = 0; i < tests.size(); i++) {
//            Test test = tests.get(i);
//            test.validate();
//        }
//
//        for(Test test: tests) {
//           // bugs.addAll(test.validate()); // without parent task implementation
//            test.validate();
//        }

        tests.forEach(test->{test.validate(); System.out.println(test);});
    }
}
