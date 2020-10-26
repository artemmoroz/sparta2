package by.issoft.cinema;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Accessors(chain = true)
public class Cinema {

    String name;
    GoodsStore food;
    GoodsStore tickets;

    public Cinema(String name) {
        this.name = name;

        food = new GoodsStore();
        tickets = new GoodsStore();
        food.setGoods(
                new ArrayList<>(
                        Arrays.asList(
                                new Food("popcorn"),
                                new Food("popcorn"),
                                new Food("popcorn"),
                                new Food("popcorn"),
                                new Food("popcorn"),
                                new Food("cola"),
                                new Food("cola"),
                                new Food("cola"),
                                new Food("cola"),
                                new Food("chips"),
                                new Food("chips"),
                                new Food("chips"),
                                new Food("chips")
                        )
                )
        );

        tickets.setGoods(new ArrayList<>(
                Arrays.asList(
                        new Ticket("Titanic"),
                        new Ticket("Titanic"),
                        new Ticket("Titanic"),
                        new Ticket("Leon"),
                        new Ticket("Leon"),
                        new Ticket("Leon"),
                        new Ticket("Leon"),
                        new Ticket("It"),
                        new Ticket("It"),
                        new Ticket("It"),
                        new Ticket("It")
                )));

    }

    public List<Good> buyTicket(String film, int count) {
        return tickets.buy(film, count);
    }

    public List<Good> buyFood(String popcorn, int count) {
        return food.buy(popcorn, count);
    }

    public double countMoney() {
        return food.countMoney() + tickets.countMoney();
    }
}
