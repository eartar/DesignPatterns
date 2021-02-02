package pattern.singleton.monostate;

public class SolutionMonostate {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ali");
        s1.setId(12314);

        System.out.println(s1);

        Student s2 = new Student();
        s1.setName("Veli");
        s1.setId(52365);

        System.out.println(s2);
        System.out.println("S1 has also become:");
        System.out.println(s1);
    }
}
