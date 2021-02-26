package pattern.facade;

import lombok.NoArgsConstructor;

class Notebook{
    private String notes;

    Notebook(){
        notes = "";
    }

    public void addNote(String note){
        notes += note+"\n";
    }

    public void closeNotebook(){
        //save notes to file
    }

    @Override
    public String toString() {
        return notes;
    }
}

class Zoom{
    boolean isOnline = false;

    public void goOnline(){
        isOnline = true;
    }

    public void goOffline(){
        isOnline = false;
    }
}

class ClassroomFacade{

    private Notebook notebook;
    private Zoom projector;

    ClassroomFacade(){
        notebook = new Notebook();
        projector = new Zoom();
    }

    void start(){
        notebook.addNote("Starting new class");
        projector.goOnline();
    }

    void learn(String content){
        notebook.addNote(content);
    }

    void end(){
        System.out.println(notebook);
        notebook.closeNotebook();
        projector.goOffline();
    }
}

public class SolutionFacade{
    public static void main(String[] args) {
        ClassroomFacade classroom = new ClassroomFacade();
        classroom.start();

        classroom.learn("Facade pattern can be");
        classroom.learn("the most architecturally");
        classroom.learn("flawed pattern ever created");
        classroom.learn("if implemented like above");
        classroom.learn("you should use interfaces");
        classroom.learn("to stop tight coupling but");
        classroom.learn("lets keep this example simple");

        classroom.end();
    }
}