package pattern.builder.fluent.facade.student.medical;

import pattern.builder.fluent.facade.student.Student;
import pattern.builder.fluent.facade.student.StudentBuilder;

public class StudentMedicalBuilder extends StudentBuilder {

    private StudentMedical medical;

    public StudentMedicalBuilder(Student student) {
        this.student = student;
        this.medical = student.getMedical();
    }

    public StudentMedicalBuilder bloodType(BloodType bloodType)
    {
        medical.setBloodType(bloodType);
        return this;
    }
    public StudentMedicalBuilder rhPos(boolean rhPos)
    {
        medical.setRhPos(rhPos);
        return this;
    }
    public StudentMedicalBuilder height(double height)
    {
        medical.setHeight(height);
        return this;
    }
    public StudentMedicalBuilder weight(double weight)
    {
        medical.setWeight(weight);
        return this;
    }

}
