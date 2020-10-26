package by.issoft.list;

import by.issoft.Car;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Class1 extends Class0{

    //attributes

    private int x = 7;

    private int yy = x+15;

    private List<Integer> collection1; // [2,3,4,4,5]


    //constructor

    public Class1() {
        collection1 = new ArrayList<>();
    }


    //methods
    public void goToCinema(int x, Class0 c){
        collection1.add(x);
        method0();
        x = method0();
        System.out.println("--"+x);
        System.out.println("++"+this.x);
    }

    public List<Integer> fff(){
        System.out.println(collection1.size());
        return collection1;
    }

    public void goToCinema2(List<Integer> xx){
        for (Integer x:xx){
            if(x>10){
                collection1.add(x);
            }
        }
    }




}
