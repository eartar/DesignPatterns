package pattern.builder.fluent.basic.problem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Builder -> not using this since we are implementing exactly it
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int id;
    private String mail;
}
