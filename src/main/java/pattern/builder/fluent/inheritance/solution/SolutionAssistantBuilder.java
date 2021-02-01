package pattern.builder.fluent.inheritance.solution;

import pattern.builder.fluent.inheritance.solution.TeachingAssistant.TeachingAssistantBuilder;
import pattern.builder.fluent.inheritance.solution.Student.StudentBuilder;

public class SolutionAssistantBuilder {
    public static void main(String[] args) {
        //To demonstrate different combinations work
        Student a1 = new TeachingAssistantBuilder().id(351).name("Ali").mail("ali34@gmail.com").assistedCourse("CS201").supervisingProfessor("Gulsen Demiroz").build();
        System.out.println(a1.toString());
        Student a2 = new TeachingAssistantBuilder().assistedCourse("CS201").supervisingProfessor("Gulsen Demiroz").id(351).name("Ali").mail("ali34@gmail.com").build();
        System.out.println(a2.toString());
        Student a3 = new TeachingAssistantBuilder().id(351).assistedCourse("CS201").mail("ali34@gmail.com").supervisingProfessor("Gulsen Demiroz").name("Ali").build();
        System.out.println(a3.toString());

        Student s1 = new StudentBuilder().id(351).name("Ali").mail("ali34@gmail.com").build();
        System.out.println(s1.toString());
    }
}
