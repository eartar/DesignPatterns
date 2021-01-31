package pattern.builder.fluent.facade.student;

import pattern.builder.fluent.facade.student.contact.StudentContactBuilder;
import pattern.builder.fluent.facade.student.medical.StudentMedicalBuilder;
import pattern.builder.fluent.facade.student.personal.StudentPersonalBuilder;

public class StudentBuilder{
    protected Student student = new Student();

    public StudentMedicalBuilder medical()
    {
        return new StudentMedicalBuilder(student);
    }

    public StudentContactBuilder contacts()
    {
        return new StudentContactBuilder(student);
    }
    public StudentPersonalBuilder personal()
    {
        return new StudentPersonalBuilder(student);
    }

    public Student build()
    {
        return student;
    }
}