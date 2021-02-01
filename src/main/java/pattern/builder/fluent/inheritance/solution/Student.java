package pattern.builder.fluent.inheritance.solution;

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

    public static class StudentBuilder <SELF extends StudentBuilder<SELF>>{
        private String name;
        private int id;
        private String mail;

        public SELF name(String name){
            this.name = name;
            return (SELF)this;
        }
        public SELF mail(String mail){
            this.mail = mail;
            return (SELF)this;
        }
        public SELF id(int id){
            this.id = id;
            return (SELF)this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }

}
