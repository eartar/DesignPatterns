package pattern.singleton.enumtype;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SolutionSingleton {

    static void WriteToFile(EnumSingleton singletonNumber) throws Exception
    {
        ObjectOutputStream single = new ObjectOutputStream(new FileOutputStream("singleton"));
        single.writeObject(singletonNumber);
    }

    static EnumSingleton ReadFromFile() throws Exception
    {
        ObjectInputStream single = new ObjectInputStream(new FileInputStream("singleton"));
        return (EnumSingleton) single.readObject();
    }

    public static void main(String[] args) throws Exception {
        EnumSingleton singletonNumber = EnumSingleton.INSTANCE;
        EnumSingleton singletonNumber2 = EnumSingleton.INSTANCE;

        //both are 0
        System.out.println(singletonNumber.getNum());
        System.out.println(singletonNumber2.getNum());

        WriteToFile(singletonNumber2);
        singletonNumber.setNum(1);

        EnumSingleton singletonNumber3 = ReadFromFile();

        //1
        System.out.println(singletonNumber.getNum());
        //1
        System.out.println(singletonNumber2.getNum());
        //0
        System.out.println(singletonNumber3.getNum());

    }



}
