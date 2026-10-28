package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Yaneli", LocalDate.of(2003, 11, 17));
        System.out.println(person.getAge());

    }
}
