package by.issoft.list;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MainClass {

    public static void main(String[] args) {
        Class1 c1 = new Class1();

        int y = c1.getX()+10;
        c1.getCollection1().forEach(c-> System.out.println(c));




        c1.goToCinema(5, new Class0());


//        c1.fff();
//

    }


}
