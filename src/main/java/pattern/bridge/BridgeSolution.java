package pattern.bridge;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
abstract class BloodType{
    protected RhType rh;

    abstract public void printType();
}

class TypeA extends BloodType{

    public TypeA(RhType th) {
        super(th);
    }

    @Override
    public void printType() {
        System.out.println("Type A");
        rh.printRh();
    }
}

class TypeB extends BloodType{

    public TypeB(RhType th) {
        super(th);
    }

    @Override
    public void printType() {
        System.out.println("Type B");
        rh.printRh();
    }
}

interface RhType{
    void printRh();
}

class RhPos implements RhType{

    @Override
    public void printRh() {
        System.out.println("rh positive");
    }
}

class RhNeg implements RhType{

    @Override
    public void printRh() {
        System.out.println("rh negative");
    }
}

public class BridgeSolution {
    public static void main(String[] args) {
        BloodType bloodTypeANeg = new TypeA(new RhNeg());
        BloodType bloodTypeBPos = new TypeB(new RhPos());

        bloodTypeANeg.printType();
        bloodTypeBPos.printType();
    }
}
