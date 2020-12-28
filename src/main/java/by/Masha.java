package by;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Masha extends Women {

   String name;
   int age;

    public Masha(String color) {
        super(color);
    }

    public static void main(String[] args) {
        Masha m = new Masha("asdasd");
        new Women("dsgsdg");

        m.setName("masha");
        System.out.println(m.getName());
    }
}
