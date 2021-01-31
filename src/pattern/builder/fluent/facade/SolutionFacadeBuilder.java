package pattern.builder.fluent.facade;


import pattern.builder.fluent.facade.student.Student;
import pattern.builder.fluent.facade.student.StudentBuilder;
import pattern.builder.fluent.facade.student.medical.BloodType;

public class SolutionFacadeBuilder {
    public static void main(String[] args) {
        Student s1 = new StudentBuilder()
                .personal()
                    .name("Zeynep")
                    .id(12351)
                    .mail("lelelelololo@gmail.com")
                .medical()
                    .bloodType(BloodType.AB)
                    .rhPos(true)
                    .weight(73)
                    .height(175)
                .contacts()
                    .primaryName("Ali")
                    .primaryPhone("+905421234567")
                    .secondaryName("Ayse")
                    .secondaryPhone("+905327580272")
                .build();

        System.out.println(s1.toString());


    }
}
