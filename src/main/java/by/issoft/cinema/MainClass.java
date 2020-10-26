package by.issoft.cinema;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MainClass {

    public static void main(String[] args) {
        Cinema cinema = new Cinema("October");


        cinema.buyTicket("Titanic", 3);
        cinema.buyFood("popcorn", 2);

        cinema.buyTicket("Leon", 1);
        cinema.buyFood("popcorn", 1);

        cinema.buyTicket("It", 4);


        cinema.buyTicket("Titanic", 1);

        System.out.println(cinema.countMoney()); // = 0
    }
}
