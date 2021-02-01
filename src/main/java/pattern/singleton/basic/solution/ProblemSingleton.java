package pattern.singleton.basic.solution;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProblemSingleton {

    static void WriteToFile(SingletonNumber singletonNumber) throws Exception
    {
        ObjectOutputStream single = new ObjectOutputStream(new FileOutputStream("singleton"));
        single.writeObject(singletonNumber);
    }

    static SingletonNumber ReadFromFile() throws Exception
    {
        ObjectInputStream single = new ObjectInputStream(new FileInputStream("singleton"));
        return (SingletonNumber) single.readObject();
    }

    public static void main(String[] args) throws Exception {
        SingletonNumber singletonNumber = SingletonNumber.getInstance();
        SingletonNumber singletonNumber2 = SingletonNumber.getInstance();

        //both are 0
        System.out.println(singletonNumber.getNum());
        System.out.println(singletonNumber2.getNum());

        WriteToFile(singletonNumber2);
        singletonNumber.setNum(1);

        SingletonNumber singletonNumber3 = ReadFromFile();

        //1
        System.out.println(singletonNumber.getNum());
        //1
        System.out.println(singletonNumber2.getNum());
        //0
        System.out.println(singletonNumber3.getNum());

    }



}
