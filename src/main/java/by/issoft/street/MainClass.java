package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Accessors(chain = true)
public class MainClass {


    public static void main(String[] args) {

//        Cinema cinema = new Cinema("Central");
//        cinema.buyTicket("sdgsadgasdg")
//        cinema.buy("poopkorn")
//                dsgsdg
//                        sag
//                        asd
//                                gsa
//                                dga
//
//        cinema.giveMeMoney();
//
//        public class Cinema{
//            List<Holle> videoZal;
//            BookingService kassa;
//            Cofeteria cofeteria;
//            TimeTable timeTable;
//
//            public void buyTicket(String film, int count, boolean vip){
//                kassa.,,,,,
//            }
//
//
//
//        }


    }


    public static void main44(String[] args) {
        Street street = new Street("Lenina str.");


        //multiFlat house
        List<Flat> manyFlatHouseFlatList = Arrays.asList(
                new Flat(1, 30, 1),//30
                new Flat(2, 50, 2),//100
                new Flat(3, 70, 4)//280
        );

        House manyFlatHouse = new MHouse(1); // 410
        manyFlatHouse.addFlats(manyFlatHouseFlatList);
        street.addBuilding(manyFlatHouse);

        //townHouse
        List<Flat> townHouseFlats = Arrays.asList(
                new Flat(1, 130, 3),//390
                new Flat(2, 150, 2) //300
        );

        House townHouse = new TownHouse(2);//690
        townHouse.addFlats(townHouseFlats);
        street.addBuilding(townHouse);

        //cottage
        List<Flat> cottageFlats = Arrays.asList(
                new Flat(1, 330, 2)//660
        );

        House cottage = new Cottage(3);//660
        cottage.addFlats(cottageFlats);
        street.addBuilding(cottage);

        //------------

        street.addBuilding(new Washer());

        street.addBuilding(new ShavaStore());

        System.out.println("Total street money: "+
                street.calculatePrice());//1760
    }


}
