package pattern.specification.problem;

import java.util.List;
import java.util.stream.Stream;

public class HouseFilter {
    //stream through the list and let houses which match the criteria pass through the filter
    public Stream<House> filterByRoomCnt(List<House> houseList, int roomCnt){
        return houseList.stream().filter(house -> house.getRoomCnt() >= roomCnt);
    }

    //now the same for area
    public Stream<House> filterByArea(List<House> houseList, double area){
        return houseList.stream().filter(house -> house.getArea() >= area);
    }

    //now the same for direction
    public Stream<House> filterByDirection(List<House> houseList, Direction direction){
        return houseList.stream().filter(house -> house.getDirection() == direction);
    }

    //now this is getting annoying..
    //what if we need to run 2 filters together, like filter by roomCnt and area?
    public Stream<House> filterByRoomCntAndArea(List<House> houseList, int roomCnt, Direction direction){
        return houseList.stream().filter(house -> house.getRoomCnt() >= roomCnt && house.getDirection() == direction);
    }

    //this is getting nowhere, many many combinations are there
    //also we obliterated Open Closed Principle of SOLID
    //A class should be open for extensions, but not for modification
    //However every time we need to add another filter in the future, we will
    //need to edit this class to support that newly added filter.

    //see solution package


}
