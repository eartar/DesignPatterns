package pattern.singleton.multiton;

import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
public class UniversityManager {

    private static HashMap<ManagerType, UniversityManager>  managers = new HashMap<>();

    public static UniversityManager getInstance(ManagerType managerType)
    {
        if (!managers.containsKey(managerType))
            managers.put(managerType, new UniversityManager());

        return managers.get(managerType);
    }

}
