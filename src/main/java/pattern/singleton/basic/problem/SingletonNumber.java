package pattern.singleton.basic.problem;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SingletonNumber implements Serializable {
    private int num = 0;
    public static final SingletonNumber INSTANCE = new SingletonNumber();

    public static SingletonNumber getInstance() {
        return INSTANCE;
    }

}
