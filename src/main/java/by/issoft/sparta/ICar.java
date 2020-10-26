package by.issoft.sparta;

public interface ICar {

    int doSomeJob();

    void doPrint(String figure);

    default void commonMethod(){
        System.out.println(124);
    }

}
