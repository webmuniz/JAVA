package academy.devdojo.maratonajava.javacore.inheritance.test;

import academy.devdojo.maratonajava.javacore.inheritance.domain.Address;
import academy.devdojo.maratonajava.javacore.inheritance.domain.Employee;
import academy.devdojo.maratonajava.javacore.inheritance.domain.Person;

/**
 * <b>Prece de Carregamento:</b><br/>
 * 0 - Bloco de inicialização estático da super class é executado quando a JVM carregar a super classe;<br/>
 * 1 - Bloco de inicialização da sub classe é executado quando a JVM carregar a subclasse;<br/>
 * 2 - Alocado espaço de memória para o objeto da super classe;<br/>
 * 3 - Cada atributo da super classe é criado e inicializado com valores default ou o que for parametrizado da super classe;<br/>
 * 4 - Bloco de inicialização da super classe é executado na ordem em que aparece;<br/>
 * 5 - Construtor da super classe é executado;<br/>
 * 6 - Alocado espaço de memória para o objeto da subclasse;<br/>
 * 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for parametrizado da subclasse;<br/>
 * 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece;<br/>
 * 9 - Construtor da sublasse é executado;
 */


public class InheritanceTest01 {
    public static void main(String[] args) {

        Address address = new Address();
        address.setStreet("Estrada do Moinho");
        address.setZipCode("23040-550");

        Person person1 = new Person("Elvis Muniz", "123.456.789-86");
        person1.setAddress(address);

        person1.print();

        Employee employee = new Employee("Thays Muniz");
        employee.setCpf("123.456.789-21");
        employee.setAddress(address);
        employee.setSalary(4000);

        employee.print();
        employee.paymentReport();


    }
}
