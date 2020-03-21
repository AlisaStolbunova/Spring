package by.it.academy.clinic;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonInfo {
    private Long id;
    private String city;
    private String street;
    private Integer flat;
}
