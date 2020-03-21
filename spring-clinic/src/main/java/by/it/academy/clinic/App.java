package by.it.academy.clinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = (Person) context.getBean("person");
        log.info(person.toString());
        person.getMeetings().forEach(System.out::println);
        Meeting meeting1 = new Meeting();
        meeting1.setId(2L);
        meeting1.setName("task2");
        List<Meeting> m = new ArrayList<>();
        m.add(meeting1);

        person.setMeetings(m);
        person.getMeetings().forEach(System.out::println);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
