package by.issoft.cinema;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class GoodsStore {

    List<Good> goods;
    double totalPrice = 0;

    public double countMoney() {
       return totalPrice;
    }

    public List<Good> buy(String name, int count) {

        List<Good> cart = new ArrayList<>();
        for (int i = 0; i < goods.size(); i++) {
            Good g = goods.get(i);
            if(g.getName().equals(name)){
                cart.add(g);
            }
            if(cart.size()==count){
                break;
            }
        }
        if(cart.size()<count){
            throw new IllegalStateException("No enough "+name);
        }else{
            goods.removeAll(cart);
        }

        totalPrice += cart.get(0).getPrice()*count;

        return cart;
    }

}
