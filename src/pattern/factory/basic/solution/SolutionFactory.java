package pattern.factory.basic.solution;

public class SolutionFactory {
    public static void main(String[] args) {
        OrderFood orderFood1 = OrderFood.Factory.GetirYemek("ali", "karnimacikti");
        System.out.println(orderFood1);

        OrderFood orderFood2 = OrderFood.Factory.YemekSepeti("veli", "olsadayesek");
        System.out.println(orderFood2);
    }
}
