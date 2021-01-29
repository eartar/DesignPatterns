package pattern.specification.solution.specs;

import pattern.specification.solution.House;

import java.util.List;

public class AndHouseSpecification<T> implements HouseSpecification {

    private final List<HouseSpecification> specificationList;

    public AndHouseSpecification(List<HouseSpecification> houseSpecifications)
    {
        this.specificationList = houseSpecifications;
    }

    @Override
    public boolean isSatisfiedBy(House house) {
        for (HouseSpecification houseSpecification : specificationList)
            if (!houseSpecification.isSatisfiedBy(house))
                return false;

        return true;
    }
}
