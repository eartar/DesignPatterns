package pattern.specification.problem;

import java.util.ArrayList;
import java.util.List;

public class ProblemHouseApp {

    public static void main(String[] args) {
        House h1 = new House.HouseBuilder().owner("Ali").roomCnt(3).area(130).direction(Direction.EAST).doorNum(122).floorNum(12).build();
        House h2 = new House.HouseBuilder().owner("Veli").roomCnt(1).area(50).direction(Direction.WEST).doorNum(16).floorNum(1).build();
        House h3 = new House.HouseBuilder().owner("Hasan").roomCnt(2).area(110).direction(Direction.SOUTH).doorNum(68).floorNum(6).build();
        House h4 = new House.HouseBuilder().owner("Huseyin").roomCnt(2).area(90).direction(Direction.SOUTH).doorNum(32).floorNum(3).build();
        House h5 = new House.HouseBuilder().owner("Mehmet").roomCnt(2).area(110).direction(Direction.NORTH).doorNum(35).floorNum(3).build();

        List<House> houseList = List.of(h1,h2,h3,h4,h5);

        System.out.println("\n");

        HouseFilter houseFilter = new HouseFilter();
        System.out.println("Houses with greater than 110 m square area");
        houseFilter.filterByArea(houseList, 120)
                .forEach(house -> System.out.println(
                        house.toString()
                ));

        System.out.println("\n");

        System.out.println("Houses with 2 rooms and south direction");
        houseFilter.filterByRoomCntAndArea(houseList, 2,Direction.SOUTH)
                .forEach(house -> System.out.println(
                        house.toString()
                ));

        System.out.println("\n");
    }
}
