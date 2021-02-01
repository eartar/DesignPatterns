package pattern.builder.fluent.inheritance.problem;

import lombok.Data;
import lombok.ToString;

//@Builder -> not using this since we are implementing exactly it
@ToString(callSuper = true)
@Data
public class TeachingAssistant extends Student {
    private String assistedCourse;
    private String supervisingProfessor;

    protected TeachingAssistant(TeachingAssistantBuilder builder){
        super(builder);
        this.assistedCourse = builder.assistedCourse;
        this.supervisingProfessor = builder.supervisingProfessor;
    }

    public static class TeachingAssistantBuilder extends StudentBuilder{
        private String assistedCourse;
        private String supervisingProfessor;

        public TeachingAssistantBuilder assistedCourse(String assistedCourse){
            this.assistedCourse = assistedCourse;
            return this;
        }
        public TeachingAssistantBuilder supervisingProfessor(String supervisingProfessor){
            this.supervisingProfessor = supervisingProfessor;
            return this;
        }
        public TeachingAssistant build()
        {
            return new TeachingAssistant(this);
        }
    }

}


