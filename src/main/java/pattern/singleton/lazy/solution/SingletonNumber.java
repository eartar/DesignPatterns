package pattern.singleton.lazy.solution;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SingletonNumber {
    private int num = 0;

    private static class Holder{
        private static final SingletonNumber INSTANCE = new SingletonNumber();
    }

    public static SingletonNumber getInstance(){return Holder.INSTANCE;}

}
