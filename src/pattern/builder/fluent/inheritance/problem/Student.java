package pattern.builder.fluent.inheritance.problem;

import lombok.Data;
import lombok.NoArgsConstructor;

//@Builder -> not using this since we are implementing exactly it
@Data
@NoArgsConstructor
public class Student {
    private String name;
    private int id;
    private String mail;

    protected Student(StudentBuilder studentBuilder){
        name = studentBuilder.name;
        id = studentBuilder.id;
        mail = studentBuilder.mail;
    }

    public static class StudentBuilder{
        private String name;
        private int id;
        private String mail;

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder mail(String mail){
            this.mail = mail;
            return this;
        }
        public StudentBuilder id(int id){
            this.id = id;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }

}
