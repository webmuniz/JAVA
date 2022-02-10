package academy.devdojo.maratonajava.javacore.exceptions.exception.test;

import academy.devdojo.maratonajava.javacore.exceptions.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.exceptions.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.exceptions.exception.domain.Person;

public class OverwrittenWithException01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
}
