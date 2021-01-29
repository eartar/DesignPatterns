package pattern.specification.solution.specs;

import lombok.AllArgsConstructor;
import pattern.specification.solution.Direction;
import pattern.specification.solution.House;

@AllArgsConstructor
public class DirectionHouseSpecification implements HouseSpecification {

    private final Direction direction;

    @Override
    public boolean isSatisfiedBy(House house) {
        return direction == house.getDirection();
    }
}
