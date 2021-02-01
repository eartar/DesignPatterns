package pattern.specification.solution.specs;

import lombok.AllArgsConstructor;
import pattern.specification.solution.House;

@AllArgsConstructor
public class RoomCntHouseSpecification implements HouseSpecification {

    private final int roomCnt;

    @Override
    public boolean isSatisfiedBy(House house) {
        return roomCnt == house.getRoomCnt();
    }
}
