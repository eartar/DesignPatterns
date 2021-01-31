package pattern.factory.abstractfactory.Ovenables;

public class Pizza implements Ovenable {
    @Override
    public void prep() {
        System.out.println("Preperation:");
        System.out.println("Preheat oven to 245 degrees Celsius using broiler");
        System.out.println("Insert grill to second to top rack");
        System.out.println("To prevent spillage, you can put aluminum foil or baking paper");
        System.out.println("---");
    }

    @Override
    public void mid() {
        System.out.println("During cooking:");
        System.out.println("Broil for 20 minutes");
        System.out.println("---");
    }

    @Override
    public void post() {
        System.out.println("After cooking is done:");
        System.out.println("Remove aluminum foil / baking paper if used");
        System.out.println("---");
    }
}
