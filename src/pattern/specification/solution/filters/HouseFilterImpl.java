package pattern.specification.solution.filters;


import pattern.specification.solution.House;
import pattern.specification.solution.specs.HouseSpecification;

import java.util.List;
import java.util.stream.Stream;

public class HouseFilterImpl implements HouseFilter {

    @Override
    public Stream<House> filter(List<House> houseList, HouseSpecification houseSpecification) {
        return houseList.stream().filter(houseSpecification::isSatisfiedBy);
    }
}
