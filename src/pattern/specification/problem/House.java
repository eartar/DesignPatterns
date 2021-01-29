package pattern.specification.problem;

import lombok.Builder;
import lombok.Data;

//@Data -> A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor!
@Data
@Builder
public class House
{
    private String owner;
    private int roomCnt;
    private double area;
    private Direction direction;
    private int doorNum;
    private int floorNum;
}
