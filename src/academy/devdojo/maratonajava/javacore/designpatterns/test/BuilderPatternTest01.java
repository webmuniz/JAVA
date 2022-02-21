package academy.devdojo.maratonajava.javacore.designpatterns.test;

import academy.devdojo.maratonajava.javacore.designpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {

        final Person person = new Person.PersonBuilder()
                .firstName("web")
                .lastName("muniz")
                .username("webmuniz")
                .email("webmuniz@github.com.br")
                .build();

        System.out.println(person);
    }

}
