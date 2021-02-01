package pattern.factory.abstractfactory.Ovenables;

import java.sql.SQLOutput;

public class LemonMeringue implements Ovenable {
    @Override
    public void prep() {
        System.out.println("Preperation:");
        System.out.println("Preheat oven to 177 degrees Celsius");
        System.out.println("Insert oven tray to middle tray");
        System.out.println("---");
    }

    @Override
    public void mid() {
        System.out.println("During cooking:");
        System.out.println("Bake for 20-25 minutes or until the meringue is browned on top");
        System.out.println("---");
    }

    @Override
    public void post() {
        System.out.println("After cooking is done:");
        System.out.println("Let the meringue cool for 1 hour before proceeding");
        System.out.println("---");
    }
}
