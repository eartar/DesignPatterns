package pattern.singleton.multiton;

public class SolutionMultiton {
    public static void main(String[] args) {
        UniversityManager managerStudent = UniversityManager.getInstance(ManagerType.Student);
        UniversityManager managerTA = UniversityManager.getInstance(ManagerType.Student);
        UniversityManager managerTA2 = UniversityManager.getInstance(ManagerType.Student);


        //managerTA and managerTA2 refer to the same object in the singleton
    }
}
