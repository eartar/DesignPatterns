package pattern.singleton.multiton;

public class SolutionMultiton {
    public static void main(String[] args) {
        UniversityManager managerStudent = UniversityManager.getInstance(ManagerType.Student);
        UniversityManager managerTA = UniversityManager.getInstance(ManagerType.Student);
        UniversityManager managerTA2 = UniversityManager.getInstance(ManagerType.Student);

        System.out.println(managerTA == managerStudent);
    }
}
