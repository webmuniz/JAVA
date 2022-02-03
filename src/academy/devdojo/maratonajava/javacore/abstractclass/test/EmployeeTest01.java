package academy.devdojo.maratonajava.javacore.abstractclass.test;

import academy.devdojo.maratonajava.javacore.abstractclass.domain.Developer;
import academy.devdojo.maratonajava.javacore.abstractclass.domain.Employee;
import academy.devdojo.maratonajava.javacore.abstractclass.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Bryan Duarte", 17000);
        System.out.println(manager1);
        manager1.print();

        Developer developer1 = new Developer("Elvis Muniz", 7000);
        System.out.println(developer1);
        developer1.print();
    }
}
