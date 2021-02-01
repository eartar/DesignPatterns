package pattern.factory.basic.problem;

public class ProblemFactory {

    public static void main(String[] args) throws Exception {
        OrderFood orderFood1 = new OrderFood("ali", "karnimacikti", "getir");
        System.out.println(orderFood1);

        OrderFood orderFood2 = new OrderFood("veli", "olsadayesek", "yemeksepeti");
        System.out.println(orderFood2);
    }

}
