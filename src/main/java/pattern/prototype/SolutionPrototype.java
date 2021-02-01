package pattern.prototype;


import org.apache.commons.lang3.SerializationUtils;

public class SolutionPrototype {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", "Bilir", 12552);
        Student s2 = SerializationUtils.roundtrip(s1);
        s2.setName("Oya");
        s2.setId(12553);

        System.out.println(s1);
        System.out.println(s2);
    }
}
