package by.issoft.cinema;

import lombok.Data;
import lombok.experimental.Accessors;


@Accessors(chain = true)
public class Ticket extends Good{

    //boolean isVip;

    public Ticket(String name){//, boolean isVip) {
        super(name, 2);
//        this.isVip = isVip;
    }

    @Override
    public double getPrice() {
        if(name.equals("Titanic")){
            price *=2;
        }
        return price;
    }
}
