package pattern.builder.fluent.basic.solution;

import pattern.builder.fluent.basic.solution.Student.StudentBuilder;

public class SolutionStudentBuilder {

    public static void main(String[] args) {
        //the first example with Student s1 similar, although this was way more extreme

        //Java actually uses StringBuilder for building strings
        StringBuilder sb = new StringBuilder();
        sb.append("hey").append(" ").append("what").append(" ").append("is").append(" ").append("up");
        String y = sb.toString();

        //At the background, there are additional memory optimizations done by the StringBuilder
        //so the builder pattern is a good way of doing custom code on our objects
        //see https://dzone.com/articles/string-concatenation-performacne-improvement-in-ja# for more details

        //Our implementation of a fluent builder
        Student first = new StudentBuilder().id(351).name("Ali").mail("ali34@gmail.com").build();
        Student second = new StudentBuilder().id(124).name("Veli").mail("velican@gmail.com").build();
        Student third = new StudentBuilder().id(155).name("Hasan").mail("huso623@windowslive.com").build();

        //The @Builder annotation of Lombok literally implement this functionality
    }
}
