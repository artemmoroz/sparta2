package by.issoft.jira;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MainClass {

    public static void main(String[] args) {
        Sprint sprint = new Sprint("sprint1");

        Task task1 = new Task("loginTask");

        //task1.tests.add(new Test("sdgsdg"));

        task1.addTest(new Test("validateCredenetials"));
        task1.addTest(new Test("inValidaCredenetials"));
        task1.addTest(new Test("validateErorrMessages"));
        sprint.addTask(task1);


        Task task2 = new Task("cartTest");
        task2.addTest(new Test("addProduct"));
        task2.addTest(new Test("checkPrice"));
        task2.addTest(new Test("shippingInfo"));
        sprint.addTask(task2);

        //---
        sprint.executeRegression();
    }

}
