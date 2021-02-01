package pattern.builder.fluent.basic.solution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Builder -> not using this since we are implementing exactly it
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int id;
    private String mail;

    @Data
    public static class StudentBuilder {
        Student student;

        public StudentBuilder name(String name){
            student.setName(name);
            return this;
        }
        public StudentBuilder mail(String mail){
            student.setMail(mail);
            return this;
        }
        public StudentBuilder id(int id){
            student.setId(id);
            return this;
        }

        public Student build()
        {
            return student;
        }
    }

}
