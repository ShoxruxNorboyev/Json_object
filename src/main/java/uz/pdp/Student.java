package uz.pdp;

import lombok.*;

//@Getter
//@Setter
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private int age;
    private String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
