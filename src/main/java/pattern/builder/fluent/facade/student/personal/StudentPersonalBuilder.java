package pattern.builder.fluent.facade.student.personal;

import pattern.builder.fluent.facade.student.Student;
import pattern.builder.fluent.facade.student.StudentBuilder;

public class StudentPersonalBuilder extends StudentBuilder {

    private StudentPersonal personal;

    public StudentPersonalBuilder(Student student) {
        this.student = student;
        this.personal = student.getPersonal();
    }

    public StudentPersonalBuilder name(String name)
    {
        personal.setName(name);
        return this;
    }
    public StudentPersonalBuilder mail(String mail)
    {
        personal.setMail(mail);
        return this;
    }
    public StudentPersonalBuilder id(int id)
    {
        personal.setId(id);
        return this;
    }

}
