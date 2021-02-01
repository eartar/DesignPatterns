package pattern.singleton.lazy.solution;

public class ProblemSingleton {

    public static void main(String[] args) throws Exception {


        SingletonNumber singletonNumber = SingletonNumber.getInstance();
        SingletonNumber singletonNumber2 = SingletonNumber.getInstance();

        //both are 0
        System.out.println(singletonNumber.getNum());
        System.out.println(singletonNumber2.getNum());

        singletonNumber.setNum(1);

        //both are 1
        System.out.println(singletonNumber.getNum());
        System.out.println(singletonNumber2.getNum());

    }
}
