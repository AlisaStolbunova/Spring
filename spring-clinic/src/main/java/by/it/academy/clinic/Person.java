package by.it.academy.clinic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Data
@NoArgsConstructor
public class Person{
    private static Person person = new Person();

    private Long id;
    private String name;
    private String surname;
    private PersonInfo personInfo;
    private Department department;
    private List<Meeting> meetings;

    public static Person getInstance(){
        return person;
    }

    public void init(){
        log.info("Initialization of Person");
    }

    public void destroy(){
        log.info("Destroy of person");
    }
}
