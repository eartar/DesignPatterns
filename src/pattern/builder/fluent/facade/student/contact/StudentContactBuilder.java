package pattern.builder.fluent.facade.student.contact;

import pattern.builder.fluent.facade.student.Student;
import pattern.builder.fluent.facade.student.StudentBuilder;

public class StudentContactBuilder extends StudentBuilder {

    private StudentContact contact;

    public StudentContactBuilder(Student student) {
        this.student = student;
        this.contact = student.getContact();
    }

    public StudentContactBuilder primaryName(String primaryName)
    {
        contact.setPrimaryName(primaryName);
        return this;
    }
    public StudentContactBuilder primaryPhone(String primaryPhone)
    {
        contact.setPrimaryPhone(primaryPhone);
        return this;
    }
    public StudentContactBuilder secondaryName(String secondaryName)
    {
        contact.setSecondaryName(secondaryName);
        return this;
    }
    public StudentContactBuilder secondaryPhone(String secondaryPhone)
    {
        contact.setSecondaryPhone(secondaryPhone);
        return this;
    }

}
