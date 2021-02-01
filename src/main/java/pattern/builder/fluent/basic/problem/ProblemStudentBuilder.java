package pattern.builder.fluent.basic.problem;

public class ProblemStudentBuilder {

    public static void main(String[] args) {

        //this is one way of doing this, but it's messy
        Student s1 = new Student();
        s1.setName("Ali");
        s1.setId(351);
        s1.setMail("ali34@gmail.com");

        //the logical way but it is possible to mess up the order of parameters if there were many more parameters
        Student s2 = new Student("Veli", 124, "velican@gmail.com");

        //Remember how string is built, its not like this
        String x = "";
        x += "hey";
        x += " ";
        x += "what";
        x += " ";
        x += "is";
        x += " ";
        x += "up";

        //if you saw that in a codebase, you would have very strong opinions on the developer behind this code

        //There is a better way of doing this?
    }
}
