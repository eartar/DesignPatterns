package pattern.builder.fluent.facade.student;

import lombok.Data;
import lombok.NoArgsConstructor;
import pattern.builder.fluent.facade.student.contact.StudentContact;
import pattern.builder.fluent.facade.student.medical.StudentMedical;
import pattern.builder.fluent.facade.student.personal.StudentPersonal;

//@Builder -> not using this since we are implementing exactly it
@Data
@NoArgsConstructor
public class Student {

    private StudentPersonal personal = new StudentPersonal();
    private StudentMedical medical = new StudentMedical();
    private StudentContact contact = new StudentContact();
}
