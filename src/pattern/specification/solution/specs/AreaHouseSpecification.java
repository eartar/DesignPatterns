package pattern.specification.solution.specs;

import lombok.AllArgsConstructor;
import pattern.specification.solution.House;

@AllArgsConstructor
public class AreaHouseSpecification implements HouseSpecification {

    private final int area;

    @Override
    public boolean isSatisfiedBy(House house) {
        return house.getArea() >= area;
    }
}