package pattern.factory.abstractfactory;

import pattern.factory.abstractfactory.Ovenables.LemonMeringue;
import pattern.factory.abstractfactory.Ovenables.Ovenable;
import pattern.factory.abstractfactory.Ovenables.Pizza;

public class SolutionAbstractFactory {

    static void callAllTheFunctions(Ovenable ovenable){
        ovenable.prep();
        ovenable.mid();
        ovenable.post();
    }

    public static void main(String[] args) {
        System.out.println("Lets make a pizza!");
        Ovenable ovenable = new Pizza();
        callAllTheFunctions(ovenable);

        System.out.println("\n\nLets make a meringue!");
        ovenable = new LemonMeringue();
        callAllTheFunctions(ovenable);
    }

}
