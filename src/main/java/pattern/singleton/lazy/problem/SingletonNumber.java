package pattern.singleton.lazy.problem;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SingletonNumber {
    private int num = 0;
    public static SingletonNumber instance;

    public static synchronized SingletonNumber getInstance() {
        if (instance == null)
            instance = new SingletonNumber();
        return instance;
    }

}
