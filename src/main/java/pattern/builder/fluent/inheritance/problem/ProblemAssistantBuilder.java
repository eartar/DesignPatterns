package pattern.builder.fluent.inheritance.problem;

import pattern.builder.fluent.inheritance.problem.Student.StudentBuilder;
import pattern.builder.fluent.inheritance.problem.TeachingAssistant.TeachingAssistantBuilder;

public class ProblemAssistantBuilder {
    public static void main(String[] args) {

        //The following line has a syntax error on assistedCourse since the previous builder(email) returns a student object, and assistedCourse is of child classes builder
        //Student a1 = new TeachingAssistantBuilder().id(351).name("Ali").mail("ali34@gmail.com").assistedCourse("CS201").supervisingProfessor("Gulsen Demiroz").build();
        //System.out.println(a1.toString());

        //we can fix the ordering but this is VERY counter intuitive, how is the clients supposed to know the right order of inheritance?
        Student a1 = new TeachingAssistantBuilder().assistedCourse("CS201").supervisingProfessor("Gulsen Demiroz").id(351).name("Ali").mail("ali34@gmail.com").build();
        System.out.println(a1.toString());

        //to demonstrate StudentBuilder still works fine
        Student s1 = new StudentBuilder().id(351).name("Ali").mail("ali34@gmail.com").build();
        System.out.println(s1.toString());
    }
}
